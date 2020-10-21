using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES;

namespace ClassLibraryZoo
{
    class Zebre:AnimalDuZoo
    {
       

        public Zebre(DateTime datedeNaissance) : base(datedeNaissance)
        {

        }

        public void Parler()
        {
            Console.WriteLine("Je parle");
        }
        public override void Deplacer()
        {
            Console.WriteLine("Je cours");
        }

       
    }
}
