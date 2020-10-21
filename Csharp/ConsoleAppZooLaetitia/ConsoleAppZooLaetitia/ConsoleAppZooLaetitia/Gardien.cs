using System;
using System.Collections.Generic;
using System.Runtime.CompilerServices;
using System.Text;

namespace WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES
{
    class Gardien: IParlable
    {

        public void Parler()
        {
            Console.WriteLine("Je parle");
        }

       // public object Age { get; private set; }

        public void Deplacer()
        {
            Console.WriteLine("Je marche");
        }

        public String toString() {
            Console.WriteLine("Je suis un gardien ");
        }
    }
}
