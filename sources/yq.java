// default package

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yq implements er, DialogInterface.OnClickListener {
    public ie a;
    public zq b;
    public CharSequence c;
    public final /* synthetic */ fr d;

    public yq(fr frVar) {
        this.d = frVar;
    }

    @Override // er
    public final boolean a() {
        ie ieVar = this.a;
        if (ieVar != null) {
            return ieVar.isShowing();
        }
        return false;
    }

    @Override // er
    public final int b() {
        return 0;
    }

    @Override // er
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // er
    public final CharSequence d() {
        return this.c;
    }

    @Override // er
    public final void dismiss() {
        ie ieVar = this.a;
        if (ieVar != null) {
            ieVar.dismiss();
            this.a = null;
        }
    }

    @Override // er
    public final Drawable g() {
        return null;
    }

    @Override // er
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // er
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // er
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // er
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // er
    public final void l(int i, int i2) {
        if (this.b == null) {
            return;
        }
        fr frVar = this.d;
        de deVar = new de(frVar.getPopupContext(), (byte) 0);
        pd pdVar = (pd) deVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            pdVar.f = charSequence;
        }
        zq zqVar = this.b;
        int selectedItemPosition = frVar.getSelectedItemPosition();
        pdVar.l = zqVar;
        pdVar.m = this;
        pdVar.b = selectedItemPosition;
        pdVar.a = true;
        ie a0 = deVar.a0();
        this.a = a0;
        AlertController$RecycleListView alertController$RecycleListView = a0.f.e;
        wq.d(alertController$RecycleListView, i);
        wq.c(alertController$RecycleListView, i2);
        this.a.show();
    }

    @Override // er
    public final int m() {
        return 0;
    }

    @Override // er
    public final void n(ListAdapter listAdapter) {
        this.b = (zq) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        fr frVar = this.d;
        frVar.setSelection(i);
        if (frVar.getOnItemClickListener() != null) {
            frVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
