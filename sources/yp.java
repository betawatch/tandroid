// default package

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yp implements eq, DialogInterface.OnClickListener {
    public id a;
    public zp b;
    public CharSequence c;
    public final /* synthetic */ fq d;

    public yp(fq fqVar) {
        this.d = fqVar;
    }

    @Override // eq
    public final boolean a() {
        id idVar = this.a;
        if (idVar != null) {
            return idVar.isShowing();
        }
        return false;
    }

    @Override // eq
    public final int b() {
        return 0;
    }

    @Override // eq
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // eq
    public final CharSequence d() {
        return this.c;
    }

    @Override // eq
    public final void dismiss() {
        id idVar = this.a;
        if (idVar != null) {
            idVar.dismiss();
            this.a = null;
        }
    }

    @Override // eq
    public final Drawable g() {
        return null;
    }

    @Override // eq
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // eq
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // eq
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // eq
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // eq
    public final void m(int i, int i2) {
        if (this.b == null) {
            return;
        }
        fq fqVar = this.d;
        dd ddVar = new dd(fqVar.getPopupContext(), (byte) 0);
        pc pcVar = (pc) ddVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            pcVar.f = charSequence;
        }
        zp zpVar = this.b;
        int selectedItemPosition = fqVar.getSelectedItemPosition();
        pcVar.l = zpVar;
        pcVar.m = this;
        pcVar.b = selectedItemPosition;
        pcVar.a = true;
        id Y = ddVar.Y();
        this.a = Y;
        AlertController$RecycleListView alertController$RecycleListView = Y.f.e;
        wp.d(alertController$RecycleListView, i);
        wp.c(alertController$RecycleListView, i2);
        this.a.show();
    }

    @Override // eq
    public final int n() {
        return 0;
    }

    @Override // eq
    public final void o(ListAdapter listAdapter) {
        this.b = (zp) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fq fqVar = this.d;
        fqVar.setSelection(i);
        if (fqVar.getOnItemClickListener() != null) {
            fqVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
