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
            AnimauxDuZoo adz = new AnimauxDuZoo(dateNow);
            

            //adz.CompareTo();
        }
    }
}
