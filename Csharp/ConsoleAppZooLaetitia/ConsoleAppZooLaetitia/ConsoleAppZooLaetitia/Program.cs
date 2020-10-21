using ClassLibraryZoo;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES;

namespace ConsoleAppTestZoo
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime dateNow = DateTime.Now;
            //AnimalDuZoo adz = new AnimalDuZoo(dateNow);


            Lion leo = new Lion(DateTime.Now);
            Perroquet coco = new Perroquet(DateTime.MinValue);
            Zebre ze = new Zebre(DateTime.MinValue);


            int resu = leo.CompareTo(coco);
            int resu1 = leo.CompareTo(ze);


            List<AnimalDuZoo> mesAnimaux = new List<AnimalDuZoo>();
            mesAnimaux.Add(leo);
            mesAnimaux.Add(coco);
            mesAnimaux.Add(ze);

            //je vous laisse rajouter 2 autres animaux..

            mesAnimaux.Sort();

            mesAnimaux.ForEach(toString());
            
            //affichage ..il faut utiliser foreach et ToString()

            //collection de IDeplacable
            List<IDeplaceable> mesDeplacess = new List<IDeplaceable>();

            //il faut utiliser la methode Deplacer foreach

            mesDeplacess.Foreach(Deplacer());

            //collection de IParlable
            
        }
    }
}
