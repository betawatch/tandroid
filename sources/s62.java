// default package

import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final /* synthetic */ class s62 implements i8c {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ u41 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ wjb e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ KeyEvent.Callback j;

    public /* synthetic */ s62(String str, String[] strArr, ImageView imageView, wjb wjbVar, boolean z, int[] iArr, u41 u41Var, HorizontalScrollView horizontalScrollView, boolean[] zArr) {
        this.f = str;
        this.g = strArr;
        this.h = imageView;
        this.e = wjbVar;
        this.d = z;
        this.i = iArr;
        this.c = u41Var;
        this.j = horizontalScrollView;
        this.b = zArr;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        wjb wjbVar = this.e;
        KeyEvent.Callback callback = this.j;
        Object obj3 = this.i;
        Object obj4 = this.h;
        boolean z = this.d;
        u41 u41Var = this.c;
        Object obj5 = this.g;
        Object obj6 = this.f;
        boolean[] zArr = this.b;
        switch (b) {
            case 0:
                ImageView imageView = (ImageView) obj4;
                int[] iArr = (int[]) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) callback;
                Bitmap bitmap = (Bitmap) obj;
                Boolean bool = (Boolean) obj2;
                if (TextUtils.equals((String) obj6, ((String[]) obj5)[0])) {
                    if (bool.booleanValue()) {
                        zkb.s(imageView, bkb.p7, wjbVar, PorterDuff.Mode.SRC_IN);
                        if (!z) {
                            int i = -iArr[0];
                            iArr[0] = i;
                            gl.A3(i, imageView, null);
                        }
                    } else {
                        zkb.s(imageView, bkb.F6, wjbVar, PorterDuff.Mode.SRC_IN);
                    }
                    if (bitmap != null) {
                        imageView.setImageBitmap(bitmap);
                    }
                    u41Var.setEnabled(!bool.booleanValue());
                    horizontalScrollView.setVisibility(bitmap != null ? 0 : 8);
                    zArr[0] = bool.booleanValue();
                    break;
                }
                break;
            default:
                s25 s25Var = (s25) obj6;
                boolean[] zArr2 = (boolean[]) obj5;
                c cVar = (c) obj4;
                TextView textView = (TextView) obj3;
                ki7 ki7Var = (ki7) callback;
                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                String str = (String) obj2;
                if (!zArr[0] && !s25Var.m && !s25Var.n) {
                    boolean z2 = s25Var.p;
                    zArr2[0] = z2;
                    u41Var.setEnabled(z2);
                    if (!zArr2[0]) {
                        if (str == null) {
                            str = k96.M0(2131742723, null);
                            w25.m("preview", str);
                        }
                        u21.d0(str, ki7Var.F, wjbVar);
                        break;
                    } else if (!z) {
                        SpannableStringBuilder r = c.r(wallettransaction.fee, true);
                        CharSequence q = cVar.q(wallettransaction.fee, true);
                        textView.setText(TextUtils.isEmpty(q) ? k96.V(null, null, 2131742876, r) : k96.V(null, null, 2131742875, r, q));
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s62(boolean[] zArr, s25 s25Var, boolean[] zArr2, u41 u41Var, boolean z, c cVar, TextView textView, ki7 ki7Var, wjb wjbVar) {
        this.b = zArr;
        this.f = s25Var;
        this.g = zArr2;
        this.c = u41Var;
        this.d = z;
        this.h = cVar;
        this.i = textView;
        this.j = ki7Var;
        this.e = wjbVar;
    }
}
