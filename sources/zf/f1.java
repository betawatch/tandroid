package zf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.messenger.cd;
import org.telegram.messenger.f5;
import org.telegram.messenger.f8;
import org.telegram.messenger.h20;
import org.telegram.messenger.i5;
import org.telegram.messenger.m5;
import org.telegram.messenger.ve;
import org.telegram.messenger.w3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.k6;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.z3;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f1 extends sk0 {
    public boolean D;
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public String I;
    public int J;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public m1 f;
    public a0.h h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f;
        return i10 == 0 || i10 == 2 || i10 == 3;
    }

    public final Object E(int i10) {
        int size = this.d.size();
        int size2 = this.H.size();
        m1 m1Var = this.f;
        int size3 = m1Var.e.size();
        int size4 = m1Var.j.size();
        if (i10 >= 0 && i10 < size) {
            return this.d.get(i10);
        }
        int i11 = i10 - size;
        if (size2 > 0) {
            if (i11 == 0) {
                return null;
            }
            if (i11 > 0 && i11 <= size2) {
                return this.H.get(i11 - 1);
            }
            i11 -= size2 + 1;
        }
        if (i11 >= 0 && i11 < size4) {
            return m1Var.j.get(i11);
        }
        int i12 = i11 - size4;
        if (i12 <= 0 || i12 > size3) {
            return null;
        }
        return m1Var.e.get(i12 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
        this.d.clear();
        this.H.clear();
        this.e.clear();
        if (this.r) {
            this.f.g(null, true, false, this.s, this.w, this.y, this.x, 0, 0);
        }
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Timer timer2 = new Timer();
        this.n = timer2;
        timer2.schedule(new ve(3, this, str), 200L, 300L);
    }

    @Override // s4.g0
    public final int b() {
        m1 m1Var = this.f;
        this.J = -1;
        int size = this.d.size();
        if (!this.H.isEmpty()) {
            this.J = size;
            size += this.H.size() + 1;
        }
        int size2 = m1Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = m1Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // s4.g0
    public final int d(int i10) {
        Object E = E(i10);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof f5 ? 3 : 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bb  */
    @Override // s4.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s4.c1 c1Var, int i10) {
        long j10;
        boolean z10;
        String str;
        CharSequence charSequence;
        int A1;
        CharSequence charSequence2;
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 != 0) {
            if (i11 == 1) {
                z3 z3Var = (z3) view;
                if (i10 == this.J) {
                    z3Var.setText(cd.L0(2131749117, null));
                    return;
                } else if (E(i10) == null) {
                    z3Var.setText(cd.L0(2131749544, null));
                    return;
                } else {
                    z3Var.setText(cd.L0(2131747299, null));
                    return;
                }
            }
            if (i11 != 2) {
                if (i11 != 3) {
                    return;
                }
                f5 f5Var = (f5) E(i10);
                ((k6) view).z(f5Var, null, i5.m(0, f5Var.i, f5Var.j), m5.h(new StringBuilder("+"), (String) f5Var.g.get(0), af.b.c()), false, false);
                return;
            }
            String str2 = (String) E(i10);
            p8 p8Var = (p8) view;
            p8Var.g(-1, t6.o6);
            p8Var.k(cd.a0(null, null, 2131754452, af.b.c().b("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i10);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = h20.n(user);
                if (str != null && this.I != null && !str.toLowerCase().contains(this.I.toLowerCase()) && user.usernames != null) {
                    for (int i12 = 0; i12 < user.usernames.size(); i12++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i12);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.I.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j10 = user.id;
                z10 = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = w3.K(chat, false);
                j10 = chat.id;
                z10 = false;
            } else {
                j10 = 0;
                z10 = false;
                str = null;
            }
            if (i10 < this.d.size()) {
                charSequence = (CharSequence) this.e.get(i10);
                if (charSequence != null && str != null && str.length() > 0 && charSequence.toString().startsWith("@".concat(str))) {
                    charSequence2 = charSequence;
                    charSequence = null;
                    k6 k6Var = (k6) view;
                    if (z10) {
                        charSequence = cd.L0(2131745918, null);
                    }
                    k6Var.z(tLObject, null, charSequence, charSequence2, false, z10);
                    k6Var.y(this.h.h(j10) >= 0, false);
                }
                str = null;
            } else if (i10 <= this.d.size() || str == null) {
                charSequence = null;
                str = null;
            } else {
                String str3 = this.f.c;
                if (str3 != null && str3.startsWith("@")) {
                    str3 = str3.substring(1);
                }
                try {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "@");
                    spannableStringBuilder.append((CharSequence) str);
                    if (str3 != null && (A1 = org.telegram.messenger.i0.A1(str, str3)) != -1) {
                        int length = str3.length();
                        if (A1 == 0) {
                            length++;
                        } else {
                            A1++;
                        }
                        spannableStringBuilder.setSpan(new l00(t6.q6, null), A1, length + A1, 33);
                    }
                    str = spannableStringBuilder;
                } catch (Exception e) {
                    f8.g(e, true);
                }
                charSequence = null;
            }
            charSequence2 = str;
            k6 k6Var2 = (k6) view;
            if (z10) {
            }
            k6Var2.z(tLObject, null, charSequence, charSequence2, false, z10);
            k6Var2.y(this.h.h(j10) >= 0, false);
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        Context context = this.c;
        if (i10 == 0) {
            k6 k6Var = new k6(context, null);
            k6Var.M0 = true;
            k6Var.E0 = true;
            view = k6Var;
        } else if (i10 == 1) {
            z3 z3Var = new z3(26, context, null);
            z3Var.setNoBackground(true);
            view = z3Var;
        } else if (i10 == 3) {
            k6 k6Var2 = new k6(context, null);
            k6Var2.M0 = true;
            k6Var2.E0 = true;
            view = k6Var2;
        } else if (i10 == 4) {
            View t0Var = new t0(context, 1);
            t0Var.setId(9);
            t0Var.setTag(-33024);
            view = t0Var;
        } else if (i10 != 5) {
            view = new p8(16, context, false);
        } else {
            zz zzVar = new zz(context, null);
            zzVar.setIsSingleCell(true);
            zzVar.setViewType(29);
            a7.i(t6.d6, zzVar, null);
            view = zzVar;
        }
        return new ck0(view);
    }
}
