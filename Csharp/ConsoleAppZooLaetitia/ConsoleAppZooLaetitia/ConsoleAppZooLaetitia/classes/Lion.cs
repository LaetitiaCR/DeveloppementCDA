using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ClassLibraryZoo
{
    class Lion
    {
        private DateTime age;

        public Lion()
        {

        }
        public Lion(DateTime age)
        {
            setAge(age);
        }

        public void setAge(DateTime age)
        {
            this.age = age;
        }
        public DateTime getAge()
        {
            return age;
        }
        public void Parler()
        {
            Console.WriteLine("Je rugis");
        }
        public void Deplacer()
        {
            Console.WriteLine("Je cours");
        }

    }
}
