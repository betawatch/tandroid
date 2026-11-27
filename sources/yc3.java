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

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yc3 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public final /* synthetic */ Object c;

    public yc3(jxb jxbVar) {
        this.a = (byte) 2;
        this.c = jxbVar;
        Context context = jxbVar.a.getContext();
        CharSequence charSequence = jxbVar.h;
        w8 w8Var = new w8();
        w8Var.e = TLObject.FLAG_12;
        w8Var.g = TLObject.FLAG_12;
        w8Var.l = null;
        w8Var.m = null;
        w8Var.n = false;
        w8Var.o = false;
        w8Var.p = 16;
        w8Var.i = context;
        w8Var.a = charSequence;
        this.b = w8Var;
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
        switch (this.a) {
            case 0:
                if (!uj3.E4) {
                    uj3.E4 = true;
                    SharedPreferences sharedPreferences = a.b.getSharedPreferences("themeconfig", 0);
                    String str = "Blue";
                    String string = sharedPreferences.getString("lastDayTheme", "Blue");
                    if (aob.O0(string) == null || aob.O0(string).o()) {
                        string = "Blue";
                    }
                    String str2 = "Dark Blue";
                    String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    if (aob.O0(string2) == null || !aob.O0(string2).o()) {
                        string2 = "Dark Blue";
                    }
                    znb znbVar = aob.I;
                    if (!string.equals(string2)) {
                        str2 = string2;
                    } else if (znbVar.o() || string.equals("Dark Blue") || string.equals("Night")) {
                        str2 = string2;
                        boolean o = aob.I.o();
                        boolean z = !o;
                        znb O0 = o ? aob.O0(str2) : aob.O0(str);
                        b29 b29Var = ((ad3) this.c).d;
                        b29Var.K(o ? b29Var.e[0] - 1 : 0);
                        ((ad3) this.c).e.getImageView().d();
                        int[] iArr = {(((ad3) this.c).e.getImageView().getMeasuredWidth() / 2) + r6, uh9.w(3.0f, ((ad3) this.c).e.getImageView().getMeasuredHeight() / 2, r6)};
                        ((ad3) this.c).e.getImageView().getLocationInWindow(iArr);
                        int i = iArr[0];
                        int i2 = iArr[1];
                        jn7.e().k(jn7.w4, O0, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), ((ad3) this.c).e.getImageView(), ((ad3) this.c).e, new bv2((Object) this, this.b, (byte) 28));
                        break;
                    }
                    str = string;
                    boolean o2 = aob.I.o();
                    boolean z2 = !o2;
                    if (o2) {
                    }
                    b29 b29Var2 = ((ad3) this.c).d;
                    b29Var2.K(o2 ? b29Var2.e[0] - 1 : 0);
                    ((ad3) this.c).e.getImageView().d();
                    int[] iArr2 = {(((ad3) this.c).e.getImageView().getMeasuredWidth() / 2) + i, uh9.w(3.0f, ((ad3) this.c).e.getImageView().getMeasuredHeight() / 2, i2)};
                    ((ad3) this.c).e.getImageView().getLocationInWindow(iArr2);
                    int i3 = iArr2[0];
                    int i22 = iArr2[1];
                    jn7.e().k(jn7.w4, O0, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z2), ((ad3) this.c).e.getImageView(), ((ad3) this.c).e, new bv2((Object) this, this.b, (byte) 28));
                }
                break;
            case 1:
                jv6 jv6Var = (jv6) this.c;
                lv6 lv6Var = jv6Var.z.r;
                jw6 jw6Var = (jw6) this.b;
                lv6Var.E = jw6Var;
                jw6Var.l();
                jv6Var.w.setVisibility(4);
                jv6Var.x.setVisibility(0);
                break;
            case 2:
                jxb jxbVar = (jxb) this.c;
                Window.Callback callback = jxbVar.k;
                if (callback != null && jxbVar.l) {
                    callback.onMenuItemSelected(0, (w8) this.b);
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

    public /* synthetic */ yc3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public yc3(Context context, Intent intent) {
        this.a = (byte) 3;
        this.b = context;
        this.c = intent;
    }
}
