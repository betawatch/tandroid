// default package

import android.database.Cursor;
import android.util.Log;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class p53 extends Filter {
    public o53 a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor cursor;
        mdb mdbVar = (mdb) this.a;
        SearchView searchView = mdbVar.w;
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursor = mdbVar.f(mdbVar.x, charSequence2);
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
            if (cursor != null) {
                cursor.getCount();
                Filter.FilterResults filterResults = new Filter.FilterResults();
                if (cursor == null) {
                    filterResults.count = cursor.getCount();
                    filterResults.values = cursor;
                } else {
                    filterResults.count = 0;
                    filterResults.values = null;
                }
                return filterResults;
            }
        }
        cursor = null;
        Filter.FilterResults filterResults2 = new Filter.FilterResults();
        if (cursor == null) {
        }
        return filterResults2;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        o53 o53Var = this.a;
        Cursor cursor = o53Var.c;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        o53Var.b((Cursor) obj);
    }
}
