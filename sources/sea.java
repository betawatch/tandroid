// default package

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sea extends FrameLayout implements fn7 {
    public static final /* synthetic */ int J = 0;
    public int E;
    public boolean F;
    public String G;
    public ux9 H;
    public rea I;
    public final yv3[] a;
    public byte b;
    public int c;
    public long d;
    public ArrayList e;
    public final ArrayList f;
    public boolean h;
    public boolean n;
    public String r;
    public final ArrayList s;
    public final HashMap w;
    public TLRPC.WebPage x;
    public int y;

    public sea(Activity activity, vnb vnbVar) {
        super(activity);
        this.a = new yv3[2];
        this.b = (byte) 0;
        this.f = new ArrayList();
        this.n = true;
        this.s = new ArrayList();
        this.w = new HashMap();
        int i = 0;
        while (true) {
            yv3[] yv3VarArr = this.a;
            if (i >= yv3VarArr.length) {
                yv3VarArr[0].setVisibility(0);
                this.a[1].setVisibility(8);
                return;
            } else {
                yv3VarArr[i] = new yv3(this, activity, vnbVar);
                addView(this.a[i], tre.c(-1.0f, -1));
                i++;
            }
        }
    }

    public static void a(yv3 yv3Var, TLRPC.WebPage webPage, String str) {
        ImageView imageView = (ImageView) yv3Var.c;
        de0 de0Var = (de0) yv3Var.r;
        imageView.setImageResource(R.drawable.msg_link2);
        ((ImageView) yv3Var.c).setVisibility(0);
        ((FrameLayout) yv3Var.h).setVisibility(8);
        ((ImageView) yv3Var.s).setVisibility(0);
        String str2 = webPage.site_name;
        if (str2 == null) {
            str2 = webPage.title;
        }
        if (str2 == null) {
            str2 = str;
        }
        ((ema) yv3Var.d).l(str2, false);
        String str3 = webPage.title;
        if (str3 == null || webPage.site_name == null) {
            str3 = webPage.description;
        }
        if (str3 == null) {
            String str4 = webPage.display_url;
            if (str4 != null) {
                str = str4;
            }
            str3 = str;
        }
        ((ema) yv3Var.e).l(str3, false);
        TLRPC.Photo photo = webPage.photo;
        if (photo != null) {
            TLRPC.PhotoSize w = xb4.w(photo.sizes, jn7.q5, false, null, false);
            TLRPC.PhotoSize w2 = xb4.w(webPage.photo.sizes, hl.L(40.0f), false, null, false);
            if (w != null) {
                de0Var.setRoundRadius(hl.L(4.0f));
                de0Var.g(1, 0L, jn5.f(w, webPage.photo), jn5.f(w2, webPage.photo), webPage, "50_50", "50_50_b", null);
                de0Var.setVisibility(0);
            } else {
                de0Var.setVisibility(8);
            }
        } else {
            de0Var.setVisibility(8);
        }
        ((LinearLayout) yv3Var.b).setClickable(false);
    }

    public static void b(de0 de0Var, no6 no6Var) {
        if (no6Var == null) {
            de0Var.setVisibility(8);
            return;
        }
        int i = no6Var.C;
        String str = no6Var.I;
        de0Var.setVisibility(0);
        de0Var.q();
        String str2 = no6Var.c;
        if (str2 != null) {
            de0Var.o(str2, null, null);
            return;
        }
        if (str == null) {
            de0Var.setImageDrawable(null);
            return;
        }
        if (no6Var.b) {
            de0Var.o(dze.d("vthumb://", i, ":", str), null, null);
            return;
        }
        de0Var.r(no6Var.J, no6Var.K, true);
        de0Var.o("thumb://" + i + ":" + str, null, null);
    }

    public final String c(yv3 yv3Var) {
        ArrayList arrayList = this.f;
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            long longValue = ((Long) obj).longValue();
            if (sb.length() > 0) {
                sb.append(", ");
            }
            if (longValue == this.d) {
                sb.append(ob6.M0(2131745629, null));
            } else {
                int size2 = arrayList.size();
                int i2 = this.c;
                sb.append(size2 == 1 ? wf3.k(i2, longValue) : wf3.r(i2, longValue));
            }
        }
        String a0 = ob6.a0(null, null, 2131745167, sb.toString());
        ema emaVar = (ema) yv3Var.e;
        return (arrayList.size() > 2 || emaVar.getPaint().measureText(a0) > ((float) (emaVar.getMeasuredWidth() <= 0 ? hl.q.x - hl.L(140.0f) : emaVar.getMeasuredWidth()))) ? ob6.G(arrayList.size(), "ShareSendToMany", new Object[0]) : a0;
    }

    public final void d() {
        if (this.y != 0) {
            ConnectionsManager.getInstance(k5.a(this.c).a).cancelRequest(this.y, true);
            this.y = 0;
        }
        this.E++;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == jn7.w0 && this.x != null && i2 == this.c) {
            zh6 zh6Var = (zh6) objArr[0];
            for (int i3 = 0; i3 < zh6Var.m(); i3++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) zh6Var.n(i3);
                if (webPage != null && webPage.id == this.x.id) {
                    if (webPage instanceof TLRPC.TL_webPageEmpty) {
                        this.x = null;
                        d();
                        if (this.b != 0) {
                            this.b = (byte) 0;
                            rea reaVar = this.I;
                            if (reaVar != null) {
                                ((xg3) reaVar).g(0);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (webPage instanceof TLRPC.TL_webPage) {
                        this.x = webPage;
                        ArrayList arrayList = this.s;
                        String str = arrayList.isEmpty() ? "" : TextUtils.join(" ", arrayList).toString();
                        HashMap hashMap = this.w;
                        if (!hashMap.containsKey(str)) {
                            hashMap.put(str, webPage);
                        }
                        a(this.a[0], webPage, str);
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(CharSequence charSequence, boolean z) {
        ArrayList arrayList;
        rea reaVar;
        boolean z2;
        if (charSequence != null && charSequence.length() != 0) {
            try {
                Matcher matcher = hl.S.matcher(charSequence);
                arrayList = null;
                while (matcher.find()) {
                    try {
                        if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                        }
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
            }
            ArrayList arrayList2 = this.s;
            if (!z) {
                if (arrayList != null) {
                    if (arrayList.size() == arrayList2.size()) {
                        for (int i = 0; i < arrayList.size(); i++) {
                            if (TextUtils.equals((CharSequence) arrayList.get(i), (CharSequence) arrayList2.get(i))) {
                            }
                        }
                        z2 = true;
                    }
                    z2 = false;
                    break;
                }
                z2 = arrayList2.isEmpty();
                if (z2) {
                    return;
                }
            }
            arrayList2.clear();
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                if (!arrayList.isEmpty()) {
                    String str = TextUtils.join(" ", arrayList).toString();
                    if (!this.n) {
                        String str2 = this.r;
                        if (str2 != null && str2.equals(str)) {
                            return;
                        }
                        this.n = true;
                        this.r = null;
                    }
                    byte b = this.b;
                    boolean z3 = (b == 2 || b == 0) ? false : true;
                    if (b != 2) {
                        this.b = (byte) 2;
                    }
                    if (z3) {
                        k();
                    }
                    TLRPC.WebPage webPage = (TLRPC.WebPage) this.w.get(str);
                    yv3[] yv3VarArr = this.a;
                    if (webPage != null) {
                        this.x = webPage;
                        a(yv3VarArr[0], webPage, str);
                    } else {
                        yv3 yv3Var = yv3VarArr[0];
                        ((ImageView) yv3Var.c).setImageResource(R.drawable.msg_link2);
                        ((ImageView) yv3Var.c).setVisibility(0);
                        ((FrameLayout) yv3Var.h).setVisibility(8);
                        ((de0) yv3Var.r).setVisibility(8);
                        ((ImageView) yv3Var.s).setVisibility(0);
                        ((ema) yv3Var.d).l(ob6.M0(2131750432, null), false);
                        ((ema) yv3Var.e).l(str == null ? "" : str, false);
                        ((LinearLayout) yv3Var.b).setClickable(false);
                        d();
                        if (str != null && !str.isEmpty()) {
                            TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                            getwebpagepreview.message = str;
                            int i2 = this.E + 1;
                            this.E = i2;
                            this.y = ConnectionsManager.getInstance(k5.a(this.c).a).sendRequest(getwebpagepreview, new hb7((Object) this, i2, (Object) str, (byte) 11));
                        }
                    }
                    yv3 yv3Var2 = yv3VarArr[0];
                    String str3 = this.G;
                    if (str3 != null) {
                        ((ema) yv3Var2.f).l(str3, false);
                    }
                    byte b2 = this.b;
                    if (b == b2 || (reaVar = this.I) == null) {
                        return;
                    }
                    ((xg3) reaVar).g(b2);
                    return;
                }
            }
            d();
            this.x = null;
            if (this.b == 0) {
                this.b = (byte) 0;
                rea reaVar2 = this.I;
                if (reaVar2 != null) {
                    ((xg3) reaVar2).g(0);
                    return;
                }
                return;
            }
            return;
        }
        arrayList = null;
        ArrayList arrayList22 = this.s;
        if (!z) {
        }
        arrayList22.clear();
        if (arrayList != null) {
        }
        d();
        this.x = null;
        if (this.b == 0) {
        }
    }

    public final de0 f(int i) {
        de0[] de0VarArr;
        if (this.b != 1 || (de0VarArr = (de0[]) this.a[0].n) == null || i < 0 || i >= de0VarArr.length || de0VarArr[i].getVisibility() != 0) {
            return null;
        }
        return de0VarArr[i];
    }

    public final void g(int i) {
        h(i);
        this.d = yac.h(k5.a(i).a).e();
        this.e = null;
        this.h = true;
        this.n = true;
        this.r = null;
        this.x = null;
        d();
        this.s.clear();
    }

    public TLRPC.WebPage getLoadedWebPage() {
        return this.x;
    }

    public int getMode() {
        return this.b;
    }

    public final void h(int i) {
        int i2 = this.c;
        int i3 = jn7.w0;
        if (i2 == i) {
            this.c = i;
            if (isAttachedToWindow()) {
                jn7.f(this.c).b(this, i3);
                return;
            }
            return;
        }
        if (isAttachedToWindow()) {
            jn7.f(this.c).n(this, i3);
        }
        this.c = i;
        if (isAttachedToWindow()) {
            jn7.f(this.c).b(this, i3);
        }
    }

    public final void i(int i, ArrayList arrayList) {
        rea reaVar;
        h(i);
        this.d = yac.h(k5.a(i).a).e();
        this.e = arrayList;
        this.h = false;
        this.x = null;
        d();
        this.s.clear();
        byte b = this.b;
        boolean z = (b == 1 || b == 0) ? false : true;
        this.b = (byte) 1;
        if (z) {
            k();
        }
        yv3[] yv3VarArr = this.a;
        yv3 yv3Var = yv3VarArr[0];
        ImageView imageView = (ImageView) yv3Var.c;
        ema emaVar = (ema) yv3Var.e;
        de0[] de0VarArr = (de0[]) yv3Var.n;
        ema emaVar2 = (ema) yv3Var.d;
        imageView.setImageResource(R.drawable.filled_forward);
        ((ImageView) yv3Var.c).setVisibility(0);
        ((de0) yv3Var.r).setVisibility(8);
        ((FrameLayout) yv3Var.h).setVisibility(0);
        ((ImageView) yv3Var.s).setVisibility(8);
        ((LinearLayout) yv3Var.b).setClickable(true);
        ArrayList arrayList2 = this.e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            emaVar2.l("", false);
            emaVar.l("", false);
            for (de0 de0Var : de0VarArr) {
                de0Var.setVisibility(8);
            }
        } else {
            int size = arrayList2.size();
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                if (((no6) obj).b) {
                    i2++;
                } else {
                    i3++;
                }
            }
            int size2 = arrayList2.size();
            if (size2 == 1) {
                emaVar2.l(ob6.M0(((no6) arrayList2.get(0)).b ? 2131745161 : 2131745172, null), false);
            } else if (i2 == 0) {
                emaVar2.l(ob6.G(size2, "ShareSendPhotos", new Object[0]), false);
            } else if (i3 == 0) {
                emaVar2.l(ob6.G(size2, "ShareSendVideos", new Object[0]), false);
            } else {
                emaVar2.l(ob6.G(size2, "ShareSendItems", new Object[0]), false);
            }
            emaVar.l(c(yv3Var), false);
            b(de0VarArr[0], arrayList2.size() > 0 ? (no6) arrayList2.get(0) : null);
            b(de0VarArr[1], arrayList2.size() > 1 ? (no6) arrayList2.get(1) : null);
            b(de0VarArr[2], arrayList2.size() > 2 ? (no6) arrayList2.get(2) : null);
        }
        yv3 yv3Var2 = yv3VarArr[0];
        String str = this.G;
        if (str != null) {
            ((ema) yv3Var2.f).l(str, false);
        }
        byte b2 = this.b;
        if (b == b2 || (reaVar = this.I) == null) {
            return;
        }
        ((xg3) reaVar).g(b2);
    }

    public final void j() {
        ux9 ux9Var = this.H;
        if (ux9Var != null) {
            hl.r(ux9Var);
            this.H = null;
        }
        this.F = false;
        for (yv3 yv3Var : this.a) {
            ema emaVar = (ema) yv3Var.e;
            emaVar.setAlpha(1.0f);
            emaVar.setScaleX(1.0f);
            emaVar.setScaleY(1.0f);
            ((ema) yv3Var.f).setAlpha(0.0f);
        }
    }

    public final void k() {
        yv3[] yv3VarArr = this.a;
        yv3 yv3Var = yv3VarArr[0];
        yv3 yv3Var2 = yv3VarArr[1];
        yv3VarArr[0] = yv3Var2;
        yv3VarArr[1] = yv3Var;
        yv3Var2.getClass();
        yv3VarArr[0].setVisibility(0);
        yv3VarArr[0].setScaleX(0.8f);
        yv3VarArr[0].setScaleY(0.8f);
        yv3VarArr[0].setAlpha(0.0f);
        yv3VarArr[0].setTranslationY(hl.L(20.0f));
        ViewPropertyAnimator translationY = yv3VarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        k43 k43Var = k43.h;
        ik8.t(translationY, k43Var, 320L);
        yv3 yv3Var3 = yv3VarArr[1];
        yv3Var3.getClass();
        yv3Var3.animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-hl.L(20.0f)).setInterpolator(k43Var).setDuration(320L).withEndAction(new ux9(yv3Var3, (byte) 19)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        jn7.f(this.c).b(this, jn7.w0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        jn7.f(this.c).n(this, jn7.w0);
        d();
    }

    public void setLayoutClickListener(View.OnClickListener onClickListener) {
        for (yv3 yv3Var : this.a) {
            ((LinearLayout) yv3Var.b).setOnClickListener(onClickListener);
        }
    }

    public void setOnModeChangeListener(rea reaVar) {
        this.I = reaVar;
    }
}
