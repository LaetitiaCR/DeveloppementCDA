using System;
using System.Collections.Generic;
using System.Dynamic;
using System.Text;

namespace WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES
{
    class Perroquet:AnimalDuZoo,IParlable
    {
      
        public Perroquet(DateTime datedeNaissance) : base(datedeNaissance)
        {

        }


        public void Parler()
        {
            Console.WriteLine("Je répète");
        }
        public override void Deplacer()
        {
            Console.WriteLine("Je vole");
        }


        //private IComparable myCompare;

    }
}
