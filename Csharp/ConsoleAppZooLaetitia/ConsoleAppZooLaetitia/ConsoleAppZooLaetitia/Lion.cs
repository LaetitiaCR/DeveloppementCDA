using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES;

namespace ClassLibraryZoo
{
    class Lion:AnimalDuZoo
    {
       

        public Lion(DateTime datedeNaissance) : base(datedeNaissance)
        {

        }

        public void Parler()
        {
            Console.WriteLine("Je rugis");
        }
        public override void Deplacer()
        {
            Console.WriteLine("Je cours");
        }

       
    }
}
