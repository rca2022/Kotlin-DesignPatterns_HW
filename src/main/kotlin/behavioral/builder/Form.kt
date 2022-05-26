package behavioral.builder

import java.util.*

class Form private constructor(builder: FormBuilder){
    var firstName: String = ""
    var middleName: String = ""
    var lastName: String = ""
    var address: String = ""
    var birthDate : Date?
    var spouseFirstName: String = ""
    var spouseMiddleName: String = ""
    var spouseLastName: String = ""

    init {
        this.firstName = builder.firstName
        this.middleName = builder.middleName
        this.lastName = builder.lastName
        this.address = builder.address
        this.birthDate = builder.birthDate
        this.spouseFirstName = builder.spouseFirstName
        this.spouseMiddleName = builder.spouseMiddleName
        this.spouseLastName = builder.spouseLastName
    }

    class FormBuilder(var firstName: String, var lastName: String) {
        var middleName: String = ""
        var address: String = ""
        var birthDate : Date? = null
        var spouseFirstName: String = ""
        var spouseMiddleName: String = ""
        var spouseLastName: String = ""

        fun addMiddleName(middleName: String) : FormBuilder {
            this.middleName = middleName
            return this
        }

        fun addAddress(address: String) : FormBuilder {
            this.address = address
            return this
        }

        fun addBirthDate(birthDate: Date) : FormBuilder {
            this.birthDate = birthDate
            return this
        }

        fun addSpouseFirstName(spouseFirstName: String) : FormBuilder {
            this.spouseFirstName = spouseFirstName
            return this
        }

        fun addSpouseMiddleName(spouseMiddleName: String) : FormBuilder {
            this.spouseMiddleName = spouseMiddleName
            return this
        }

        fun addSpouseLastName(spouseLastName: String) : FormBuilder {
            this.spouseLastName = spouseLastName
            return this
        }

        fun build() : Form {
            return Form(this)
        }

    }
}