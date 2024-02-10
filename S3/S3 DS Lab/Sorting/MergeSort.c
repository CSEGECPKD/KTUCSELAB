void merge(int *a,int lb,int mid,int ud)
{
    int b[30];
    int i=lb;
    int j= mid +1;
    int k= lb;

    while(i<=mid && j<=ub)
    {
        if(a[i]<a[j])
        {
            b[k]=a[i];
            i++;

        }
        else
        {
            b[k]==a[j];
            j++;
        }
        k++;
    }
    while(i<=mid)
    {
        b[k]=a[j];
        i++;
        k++;
    }

       while(i<=mid)
    {
        b[k]=a[j];
        i++;
        k++;
    }

    for(int temp=ib;temp,=ub.tmep+)
}