// default package

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zka extends n5c {
    public yka e;
    public yka[] f = new yka[0];
    public String[] h = new String[0];
    public final xka n = new xka(this, 0);

    @Override // n5c
    public final void Y(ArrayList arrayList, l5c l5cVar) {
        c4c i = c4c.i(6, k96.M0(2131745056, null));
        byte b = 1;
        i.L(na7.c1().getBoolean("asr_live_text", true));
        arrayList.add(i);
        arrayList.add(c4c.C(k96.M0(2131745055, null)));
        int i2 = 0;
        if (DictationAsr.C(this.currentAccount)) {
            c4c i3 = c4c.i(2, k96.M0(2131745053, null));
            i3.L(DictationAsr.B(this.currentAccount));
            arrayList.add(i3);
            String M0 = k96.M0(2131745052, null);
            xka xkaVar = new xka(this, b);
            String M02 = k96.M0(2131745061, null);
            int i4 = bkb.p6;
            SpannableStringBuilder O2 = gl.O2(M02, i4, 0, xkaVar, null);
            SpannableString spannableString = new SpannableString(">");
            cm2 cm2Var = new cm2(R.drawable.msg_arrowright, 0);
            cm2Var.a(i4);
            cm2Var.c(gl.L(18.0f));
            cm2Var.F = gl.L(11.0f);
            cm2Var.r = -gl.L(5.0f);
            spannableString.setSpan(cm2Var, 0, spannableString.length(), 33);
            SpannableStringBuilder H2 = gl.H2(O2, spannableString, ">");
            for (ClickableSpan clickableSpan : (ClickableSpan[]) H2.getSpans(0, H2.length(), ClickableSpan.class)) {
                int spanStart = H2.getSpanStart(clickableSpan);
                int spanFlags = H2.getSpanFlags(clickableSpan);
                H2.removeSpan(clickableSpan);
                H2.setSpan(clickableSpan, spanStart, H2.length(), spanFlags);
            }
            arrayList.add(c4c.C(TextUtils.concat(M0, " ", H2)));
        }
        oo1.o(2131745062, null, arrayList);
        yka ykaVar = this.e;
        if (ykaVar != null) {
            arrayList.add(c4c.j(1, ykaVar));
        }
        while (true) {
            yka[] ykaVarArr = this.f;
            if (i2 >= ykaVarArr.length) {
                arrayList.add(c4c.C(null));
                boolean z = w01.a;
                c4c e = c4c.e(4, k96.M0(2131745071, null));
                e.s = true;
                arrayList.add(e);
                c4c e2 = c4c.e(5, k96.M0(2131745070, null));
                e2.s = true;
                arrayList.add(e2);
                arrayList.add(c4c.C(null));
                d0();
                return;
            }
            yka ykaVar2 = ykaVarArr[i2];
            if (ykaVar2 != null) {
                arrayList.add(c4c.j(i2 + 100, ykaVar2));
            }
            i2++;
        }
    }

    @Override // n5c
    public final CharSequence Z() {
        return k96.M0(2131745039, null);
    }

    @Override // n5c
    public final void a0(c4c c4cVar, View view) {
        int i = c4cVar.d;
        if (i == 2) {
            na7.c1().edit().putBoolean(y6c.h(this.currentAccount).p() ? "asr_local_premium" : "asr_local_free", !DictationAsr.B(r9)).apply();
            for (int i2 = 0; i2 < 4; i2++) {
                if (y6c.h(i2).o()) {
                    kk7.f(i2).k(kk7.D1, new Object[0]);
                }
            }
        } else {
            if (i == 4) {
                DictationAsr.p();
                d0();
                return;
            }
            byte b = 6;
            if (i == 5) {
                int i3 = 0;
                while (i3 < 4) {
                    if (y6c.h(i3).o()) {
                        boolean z = i3 == this.currentAccount;
                        ad7 Y = ad7.Y(i3);
                        Y.a.c(new t67(Y, new ra(b, this, z), (byte) 18));
                    }
                    i3++;
                }
                return;
            }
            if (i != 6) {
                return;
            } else {
                na7.c1().edit().putBoolean("asr_live_text", !na7.c1().getBoolean("asr_live_text", true)).apply();
            }
        }
        this.a.g3.O(true);
    }

    @Override // n5c
    public final boolean b0(c4c c4cVar, View view) {
        return false;
    }

    public final void c0(Context context) {
        String[] G = DictationAsr.G();
        this.h = G;
        this.f = new yka[G.length];
        int i = 0;
        while (i < G.length) {
            vl3 L = DictationAsr.L(G[i]);
            boolean z = i == 0 || DictationAsr.L(G[i + (-1)]) != L;
            boolean z2 = i < G.length - 1 && DictationAsr.L(G[i + 1]) != L;
            String r = jm3.r(G[i]);
            yka[] ykaVarArr = this.f;
            String str = G[i];
            yka ykaVar = new yka(context, str, r != null ? r : str, (!z || L.e <= 0) ? null : gl.i0(L.e, false, false), z2);
            ykaVarArr[i] = ykaVar;
            ykaVar.a0 = new t7a((Object) this, (Object) ykaVar, (byte) 8);
            ykaVar.setOnClickListener(new b99(this, ykaVar, (byte) 9));
            i++;
        }
    }

    @Override // n5c, org.telegram.ui.ActionBar.d
    public final View createView(Context context) {
        setHasOwnBackground(true);
        yka ykaVar = new yka(context, null, k96.M0(2131745072, null), null, true);
        this.e = ykaVar;
        ykaVar.setOnClickListener(new ik8(this, (byte) 29));
        c0(context);
        this.fragmentView = super.createView(context);
        this.a.r1();
        this.a.setSectionsDrawBackground(true);
        DictationAsr.i(this.n);
        zm3.j();
        return this.fragmentView;
    }

    public final void d0() {
        yka ykaVar = this.e;
        if (ykaVar != null) {
            ykaVar.c();
        }
        for (yka ykaVar2 : this.f) {
            if (ykaVar2 != null) {
                ykaVar2.c();
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.d
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void onFragmentDestroy() {
        DictationAsr.T(this.n);
        super.onFragmentDestroy();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final boolean useSimpleActionBar() {
        return true;
    }
}
