// default package

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class t04 extends n39 {
    public boolean E;
    public boolean F;
    public final /* synthetic */ t14 G;
    public final o04 c;
    public long d;
    public TLRPC.StickerSet e;
    public ArrayList f;
    public final ArrayList h = new ArrayList();
    public final ArrayList n = new ArrayList();
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public String w;
    public String x;
    public s04 y;

    public t04(t14 t14Var, Context context) {
        this.G = t14Var;
        o04 o04Var = new o04(context, t14Var.d1, new w72(this, (byte) 25), new kx3(this, (byte) 1), t14Var.a2);
        this.c = o04Var;
        o04Var.setPadding(gl.L(10.0f), 0, gl.L(10.0f), gl.L(5.0f));
        o04Var.setClipToPadding(false);
        o04Var.g3.r = false;
        o04Var.setNestedScrollingEnabled(false);
        o04Var.setDrawSelection(false);
        o04Var.setOnTouchListener(new p04(this, (byte) 0));
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 4;
    }

    public final void E(String str, boolean z) {
        t14 t14Var = this.G;
        g04 g04Var = t14Var.Q;
        if (TextUtils.isEmpty(str)) {
            this.w = null;
            w39 adapter = g04Var.getAdapter();
            d04 d04Var = t14Var.S;
            if (adapter != d04Var) {
                g04Var.setAdapter(d04Var);
                this.E = false;
            }
            this.d = 0L;
            t14Var.b.a(false, true);
            f();
        } else {
            this.w = str.toLowerCase();
        }
        s04 s04Var = this.y;
        if (s04Var != null) {
            gl.r(s04Var);
        }
        if (TextUtils.isEmpty(this.w)) {
            return;
        }
        this.n.clear();
        this.F = false;
        t14Var.W.d(true);
        s04 s04Var2 = new s04(this);
        this.y = s04Var2;
        gl.e3(s04Var2, z ? 300L : 0L);
    }

    public final void F(Runnable runnable, ArrayList arrayList, boolean z) {
        t14 t14Var = this.G;
        String[] strArr = t14Var.X0;
        String str = (strArr == null || strArr.length == 0) ? "" : strArr[0];
        String str2 = this.w;
        if (str2 == null) {
            return;
        }
        hq6.d0(t14Var.d1).b2(true, str, str2, new au0((Object) this, str2, (Object) arrayList, (Object) runnable, (byte) 8), z);
    }

    @Override // w39
    public final int b() {
        if (this.d != 0) {
            return this.f.size() + 4;
        }
        ArrayList arrayList = this.h;
        boolean isEmpty = arrayList.isEmpty();
        ArrayList arrayList2 = this.s;
        ArrayList arrayList3 = this.r;
        if (isEmpty && arrayList3.isEmpty() && arrayList2.isEmpty() && !this.E) {
            return this.G.getRecentEmoji().size() + 1;
        }
        int i = 2;
        if (arrayList.isEmpty() && arrayList3.isEmpty() && arrayList2.isEmpty()) {
            return 2;
        }
        if (!arrayList2.isEmpty()) {
            i = 3;
        } else if (arrayList.isEmpty()) {
            i = 1;
        }
        int size = arrayList.size() + i;
        if (arrayList3.isEmpty()) {
            return size;
        }
        return arrayList3.size() + size + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r7 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x004f, code lost:
    
        if (r7 == 1) goto L44;
     */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int d(int i) {
        int i2 = 2;
        if (this.d != 0) {
            if (i != 0) {
                if (i == 1) {
                    return 4;
                }
                if (i != 2) {
                    return i == b() - 1 ? 5 : 0;
                }
                return 3;
            }
            return 1;
        }
        if (i != 0) {
            ArrayList arrayList = this.s;
            ArrayList arrayList2 = this.r;
            ArrayList arrayList3 = this.h;
            if (i == 1 && this.E && arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                return 2;
            }
            if (arrayList.isEmpty()) {
                if (!arrayList3.isEmpty()) {
                }
                if (arrayList2.isEmpty()) {
                    return 0;
                }
                if (!arrayList.isEmpty()) {
                    i2 = 3;
                } else if (arrayList3.isEmpty()) {
                    i2 = 1;
                }
                if (i != arrayList3.size() + i2) {
                    return 0;
                }
            } else if (i == 1) {
                return 4;
            }
            return 3;
        }
        return 1;
    }

    @Override // w39
    public final void f() {
        this.c.g3.O(false);
        super.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        String str;
        String str2;
        TLRPC.Document document;
        String str3;
        String str4;
        Long l;
        int i2 = s49Var.f;
        View view = s49Var.a;
        ArrayList arrayList = this.s;
        boolean z = true;
        int i3 = 1;
        ArrayList arrayList2 = this.h;
        if (i2 != 0) {
            if (i2 != 3) {
                return;
            }
            vza vzaVar = (vza) view;
            if (this.d != 0) {
                vzaVar.a(0, k96.G(this.f.size(), "EmojiCount", new Object[0]));
                return;
            }
            if (!arrayList.isEmpty()) {
                i3 = 3;
            } else if (!arrayList2.isEmpty()) {
                i3 = 2;
            }
            if (i == arrayList2.size() + i3) {
                vzaVar.a(0, k96.M0(2131744638, null));
                return;
            } else {
                vzaVar.a(0, k96.M0(2131744637, null));
                return;
            }
        }
        c14 c14Var = (c14) view;
        c14Var.a = i;
        c14Var.e = null;
        int i4 = i - 1;
        if (!arrayList.isEmpty() || this.d != 0) {
            i4 = i - 3;
        } else if (!arrayList2.isEmpty()) {
            i4 = i - 2;
        }
        if (this.d != 0) {
            document = (TLRPC.Document) this.f.get(i4);
            z = false;
            str = null;
            str2 = null;
        } else {
            boolean isEmpty = arrayList2.isEmpty();
            ArrayList arrayList3 = this.r;
            if (isEmpty && arrayList3.isEmpty() && !this.E) {
                str = this.G.getRecentEmoji().get(i4);
                str2 = str;
            } else {
                str = i4 < arrayList2.size() ? ((dq6) arrayList2.get(i4)).a : ((dq6) arrayList3.get((i4 - arrayList2.size()) - 1)).a;
                str2 = str;
                z = false;
            }
            document = null;
        }
        if (str != null && str.startsWith("animated_")) {
            try {
                l = Long.valueOf(Long.parseLong(str.substring(9)));
                str4 = null;
                str3 = null;
            } catch (Exception unused) {
            }
            if (document == null || l != null) {
                c14Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
            } else {
                c14Var.setPadding(0, 0, 0, 0);
            }
            if (document == null) {
                c14Var.a(null, z);
                if (c14Var.getSpan() == null || c14Var.getSpan().document != document) {
                    c14Var.setSpan(new gm(document, (Paint.FontMetricsInt) null));
                }
            } else if (l != null) {
                c14Var.a(null, z);
                if (c14Var.getSpan() == null || c14Var.getSpan().getDocumentId() != l.longValue()) {
                    c14Var.setSpan(new gm(l.longValue(), (Paint.FontMetricsInt) null));
                }
            } else if (str3 != null) {
                c14Var.a(vu3.f(str3), z);
                c14Var.setSpan(null);
            } else {
                c14Var.a(null, z);
                c14Var.setSpan(null);
            }
            c14Var.setTag(str4);
        }
        str3 = str2;
        str4 = str;
        l = null;
        if (document == null) {
        }
        c14Var.setPadding(gl.L(3.0f), gl.L(3.0f), gl.L(3.0f), gl.L(3.0f));
        if (document == null) {
        }
        c14Var.setTag(str4);
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        t14 t14Var = this.G;
        wjb wjbVar = t14Var.a2;
        if (i == 0) {
            view = new c14(t14Var.getContext());
        } else if (i == 1) {
            View view2 = new View(t14Var.getContext());
            view2.setLayoutParams(new e49(-1, t14Var.c1));
            view = view2;
        } else if (i == 3) {
            view = new vza(t14Var.getContext(), true, false, t14Var.a2, t14Var.j2);
        } else if (i == 4) {
            ViewGroup.LayoutParams e49Var = new e49(-1, gl.L(79.0f));
            View view3 = this.c;
            view3.setLayoutParams(e49Var);
            view = view3;
        } else if (i != 5) {
            yc ycVar = new yc((byte) 18, t14Var.getContext(), this);
            TextView textView = new TextView(t14Var.getContext());
            tb4.u(16.0f, 2131748021, 1, textView, null);
            int i2 = bkb.Cf;
            zkb.X(textView, i2, wjbVar);
            ycVar.addView(textView, nme.d(-2, -2.0f, 49, 0.0f, 10.0f, 0.0f, 0.0f));
            ImageView imageView = new ImageView(t14Var.getContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.msg_emoji_question);
            zkb.s(imageView, i2, wjbVar, PorterDuff.Mode.MULTIPLY);
            ycVar.addView(imageView, nme.e(48, 48, 85));
            imageView.setOnClickListener(new g6(this, (byte) 5));
            ycVar.setLayoutParams(new e49(-1, -2));
            view = ycVar;
        } else {
            View view4 = new View(t14Var.getContext());
            view4.setLayoutParams(new e49(-1, gl.L(68.0f)));
            view = view4;
        }
        return new y29(view);
    }
}
