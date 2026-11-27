// default package

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class v43 extends BaseAdapter implements Filterable {
    public boolean a;
    public boolean b;
    public Cursor c;
    public int d;
    public t43 e;
    public u43 f;
    public w43 h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                t43 t43Var = this.e;
                if (t43Var != null) {
                    cursor2.unregisterContentObserver(t43Var);
                }
                u43 u43Var = this.f;
                if (u43Var != null) {
                    cursor2.unregisterDataSetObserver(u43Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                t43 t43Var2 = this.e;
                if (t43Var2 != null) {
                    cursor.registerContentObserver(t43Var2);
                }
                u43 u43Var2 = this.f;
                if (u43Var2 != null) {
                    cursor.registerDataSetObserver(u43Var2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            return null;
        }
        this.c.moveToPosition(i);
        if (view == null) {
            gfb gfbVar = (gfb) this;
            view = gfbVar.s.inflate(gfbVar.r, viewGroup, false);
        }
        a(view, this.c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        w43 w43Var = this.h;
        if (w43Var != null) {
            return w43Var;
        }
        w43 w43Var2 = new w43();
        w43Var2.a = this;
        this.h = w43Var2;
        return w43Var2;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.a || (cursor = this.c) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.a && (cursor = this.c) != null && cursor.moveToPosition(i)) {
            return this.c.getLong(this.d);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.a) {
            grb.i("this should only be called when the cursor is valid");
            return null;
        }
        if (!this.c.moveToPosition(i)) {
            grb.i(uh9.k(i, "couldn't move cursor to position "));
            return null;
        }
        if (view == null) {
            gfb gfbVar = (gfb) this;
            view = gfbVar.s.inflate(gfbVar.n, viewGroup, false);
            view.setTag(new ffb(view));
            ((ImageView) view.findViewById(R.id.edit_query)).setImageResource(gfbVar.F);
        }
        a(view, this.c);
        return view;
    }
}
