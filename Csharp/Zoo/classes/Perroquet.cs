using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Text;

namespace WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES
{
    class Perroquet
    {
        private DateTime age;

        public Perroquet()
        {

        }
        public Perroquet(DateTime age)
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
            Console.WriteLine("Je répète");
        }
        public void Deplacer()
        {
            Console.WriteLine("Je vole");
        }


        //private IComparable myCompare;

    }
}
