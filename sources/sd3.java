// default package

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import android.view.View;
import android.view.Window;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class sd3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public sd3(jvb jvbVar) {
        this.a = (byte) 2;
        this.c = jvbVar;
        Context context = jvbVar.a.getContext();
        CharSequence charSequence = jvbVar.h;
        v8 v8Var = new v8();
        v8Var.e = TLObject.FLAG_12;
        v8Var.g = TLObject.FLAG_12;
        v8Var.l = null;
        v8Var.m = null;
        v8Var.n = false;
        v8Var.o = false;
        v8Var.p = 16;
        v8Var.i = context;
        v8Var.a = charSequence;
        this.b = v8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        byte b = 0;
        switch (this.a) {
            case 0:
                if (!nk3.E4) {
                    nk3.E4 = true;
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (cmb.O0(string) == null || cmb.O0(string).o()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (cmb.O0(string2) == null || !cmb.O0(string2).o()) {
                        string2 = "Dark Blue";
                    }
                    bmb bmbVar = cmb.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (bmbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean o = cmb.I.o();
                        boolean z = !o;
                        bmb O0 = o ? cmb.O0(str2) : cmb.O0(str);
                        p09 p09Var = ((ud3) this.c).d;
                        p09Var.K(o ? p09Var.e[0] - 1 : 0);
                        ((ud3) this.c).e.getImageView().d();
                        int[] iArr = {(((ud3) this.c).e.getImageView().getMeasuredWidth() / 2) + r6, hg9.v(3.0f, ((ud3) this.c).e.getImageView().getMeasuredHeight() / 2, r6)};
                        ((ud3) this.c).e.getImageView().getLocationInWindow(iArr);
                        int i = iArr[0];
                        int i2 = iArr[1];
                        nm7.e().k(nm7.x4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), ((ud3) this.c).e.getImageView(), ((ud3) this.c).e, new rd3(this, (d) this.b, b));
                        break;
                    }
                    str = string;
                    boolean o2 = cmb.I.o();
                    boolean z2 = !o2;
                    if (o2) {
                    }
                    p09 p09Var2 = ((ud3) this.c).d;
                    p09Var2.K(o2 ? p09Var2.e[0] - 1 : 0);
                    ((ud3) this.c).e.getImageView().d();
                    int[] iArr2 = {(((ud3) this.c).e.getImageView().getMeasuredWidth() / 2) + i, hg9.v(3.0f, ((ud3) this.c).e.getImageView().getMeasuredHeight() / 2, i2)};
                    ((ud3) this.c).e.getImageView().getLocationInWindow(iArr2);
                    int i3 = iArr2[0];
                    int i22 = iArr2[1];
                    nm7.e().k(nm7.x4, O0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z2), ((ud3) this.c).e.getImageView(), ((ud3) this.c).e, new rd3(this, (d) this.b, b));
                }
                break;
            case 1:
                ev6 ev6Var = (ev6) this.c;
                gv6 gv6Var = ev6Var.z.r;
                ew6 ew6Var = (ew6) this.b;
                gv6Var.E = ew6Var;
                ew6Var.l();
                ev6Var.w.setVisibility(4);
                ev6Var.x.setVisibility(0);
                break;
            case 2:
                jvb jvbVar = (jvb) this.c;
                Window.Callback callback = jvbVar.k;
                if (callback != null && jvbVar.l) {
                    callback.onMenuItemSelected(0, (v8) this.b);
                    break;
                }
                break;
            default:
                try {
                    ((Context) this.b).startActivity((Intent) this.c);
                    break;
                } catch (ActivityNotFoundException e) {
                    Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", e);
                    return;
                }
        }
    }

    public /* synthetic */ sd3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public sd3(Context context, Intent intent) {
        this.a = (byte) 3;
        this.b = context;
        this.c = intent;
    }
}
