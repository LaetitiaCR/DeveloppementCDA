using ClassLibraryZoo;
using System;
using System.Collections.Generic;
using System.Text;

namespace WindowsFormsAppMyAppli.FoldZoo.MyLibrairieCLASSES
{
    public abstract class AnimalDuZoo:IComparable,IDeplaceable
    {

        private DateTime dateDeNaissance;

        public AnimalDuZoo(DateTime dateNaiss)
        {
            this.dateDeNaissance = dateNaiss;
        }

        public int CompareTo(object obj)
        {
            AnimalDuZoo a = (AnimalDuZoo)obj;
            return this.dateDeNaissance.CompareTo(a.dateDeNaissance);
        }

        public override string ToString()
        {
            return base.ToString() + " dateDeNaissance="+ dateDeNaissance;
        }

        public abstract void Deplacer();
    }
}