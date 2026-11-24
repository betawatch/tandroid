// default package

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vub extends n7 {
    public boolean a = false;
    public final /* synthetic */ avb b;

    public vub(avb avbVar) {
        this.b = avbVar;
    }

    @Override // n7
    public final void h() {
        avb avbVar = this.b;
        byte b = 0;
        if (avbVar.a.getVisibility() != 0) {
            avbVar.a.setVisibility(0);
            avbVar.a.setAlpha(0.0f);
        }
        avbVar.r.setVisibility(8);
        avbVar.d.f();
        avbVar.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        avbVar.s.animate().alpha(0.0f).setDuration(150L).setListener(new uub(this, b)).start();
        this.a = false;
    }

    @Override // n7
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        String obj = editTextBoldCursor.getText().toString();
        zub zubVar = this.b.e;
        if (zubVar.e != null) {
            Utilities.g.a(zubVar.e);
            zubVar.e = null;
        }
        byte b = 0;
        byte b2 = 1;
        if (TextUtils.isEmpty(obj)) {
            zubVar.c.clear();
            zubVar.d.clear();
            zubVar.f();
            zubVar.h.r.setVisibility(8);
        } else {
            int i = zubVar.f + 1;
            zubVar.f = i;
            mp3 mp3Var = Utilities.g;
            yub yubVar = new yub(zubVar, obj, i, b);
            zubVar.e = yubVar;
            mp3Var.d(yubVar, 300L);
        }
        if (this.a || TextUtils.isEmpty(obj)) {
            if (this.a && TextUtils.isEmpty(obj)) {
                h();
                return;
            }
            return;
        }
        if (this.b.s.getVisibility() != 0) {
            this.b.s.setVisibility(0);
            this.b.s.setAlpha(0.0f);
        }
        this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new uub(this, b2)).start();
        this.b.e.d.clear();
        this.b.e.c.clear();
        this.b.e.f();
        this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
        this.a = true;
    }
}
