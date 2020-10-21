using ClassLibraryZoo;
using System;
using System.Collections.Generic;
using System.Text;

namespace WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES
{
    public class AnimauxDuZoo:IComparable
    {

        private DateTime dateDeNaissance;

        public AnimauxDuZoo(DateTime dateNaiss)
        {
            this.dateDeNaissance = dateNaiss;
     
            Perroquet p = new Perroquet(DateTime.Now);
            Lion l = new Lion(DateTime.Now);
        }

       
        int IComparable.CompareTo(object obj)
        {
            return this.dateDeNaissance.CompareTo(obj);
        }


     


    }
}