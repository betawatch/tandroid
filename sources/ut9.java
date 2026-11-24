// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Timer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class ut9 extends q59 {
    public boolean E;
    public int F;
    public int G;
    public ArrayList H;
    public ArrayList I;
    public String J;
    public int K;
    public Context c;
    public ArrayList d;
    public ArrayList e;
    public bu9 f;
    public vh6 h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return i == 0 || i == 2 || i == 3;
    }

    public final Object E(int i) {
        int size = this.d.size();
        int size2 = this.I.size();
        bu9 bu9Var = this.f;
        int size3 = bu9Var.e.size();
        ArrayList arrayList = bu9Var.j;
        int size4 = arrayList.size();
        if (i >= 0 && i < size) {
            return this.d.get(i);
        }
        int i2 = i - size;
        if (size2 > 0) {
            if (i2 == 0) {
                return null;
            }
            if (i2 > 0 && i2 <= size2) {
                return this.I.get(i2 - 1);
            }
            i2 -= size2 + 1;
        }
        if (i2 >= 0 && i2 < size4) {
            return arrayList.get(i2);
        }
        int i3 = i2 - size4;
        if (i3 <= 0 || i3 > size3) {
            return null;
        }
        return bu9Var.e.get(i3 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
        this.d.clear();
        this.I.clear();
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
        timer2.schedule(new yy2(this, str, (byte) 3), 200L, 300L);
    }

    @Override // y59
    public final int b() {
        bu9 bu9Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = bu9Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = bu9Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // y59
    public final int d(int i) {
        Object E = E(i);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof yv2 ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        long j;
        boolean z;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int y1;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                l55 l55Var = (l55) view;
                if (i == this.K) {
                    l55Var.setText(jb6.M0(2131748864, null));
                    return;
                } else if (E(i) == null) {
                    l55Var.setText(jb6.M0(2131749309, null));
                    return;
                } else {
                    l55Var.setText(jb6.M0(2131747016, null));
                    return;
                }
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    yv2 yv2Var = (yv2) E(i);
                    ((ut8) view).x(yv2Var, null, bw2.m(0, yv2Var.i, yv2Var.j), mlb.l(new StringBuilder("+"), (String) yv2Var.g.get(0), r58.f()), false, false);
                    return;
                }
                return;
            }
            String str2 = (String) E(i);
            xib xibVar = (xib) view;
            xibVar.g(-1, cmb.n6);
            xibVar.k(jb6.a0(null, null, 2131754449, r58.f().e("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = m9c.p(user);
                if (str != null && this.J != null && !str.toLowerCase().contains(this.J.toLowerCase()) && user.usernames != null) {
                    for (int i3 = 0; i3 < user.usernames.size(); i3++) {
                        TLRPC.TL_username tL_username = user.usernames.get(i3);
                        if (tL_username != null && tL_username.active && tL_username.username.toLowerCase().contains(this.J.toLowerCase())) {
                            str = tL_username.username;
                        }
                    }
                }
                j = user.id;
                z = user.self;
            } else if (tLObject instanceof TLRPC.Chat) {
                TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                str = sd2.K(chat, false);
                j = chat.id;
                z = false;
            } else {
                j = 0;
                z = false;
                str = null;
            }
            if (i >= this.d.size()) {
                if (i <= this.d.size() || str == null) {
                    charSequence = null;
                    charSequence2 = null;
                } else {
                    String str3 = this.f.c;
                    if (str3 != null && str3.startsWith("@")) {
                        str3 = str3.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append("@");
                        spannableStringBuilder.append((CharSequence) str);
                        if (str3 != null && (y1 = gm.y1(str, str3)) != -1) {
                            int length = str3.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder.setSpan(new do4(cmb.p6, null), y1, length + y1, 33);
                        }
                        charSequence2 = spannableStringBuilder;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        charSequence = null;
                        charSequence2 = str;
                    }
                }
                ut8 ut8Var = (ut8) view;
                if (z) {
                }
                ut8Var.x(tLObject, null, charSequence, charSequence2, false, z);
                ut8Var.w(this.h.h(j) >= 0, false);
            }
            charSequence = (CharSequence) this.e.get(i);
            if (charSequence == null || str == null || str.length() <= 0 || !charSequence.toString().startsWith("@".concat(str))) {
                charSequence2 = null;
                ut8 ut8Var2 = (ut8) view;
                if (z) {
                    charSequence = jb6.M0(2131745635, null);
                }
                ut8Var2.x(tLObject, null, charSequence, charSequence2, false, z);
                ut8Var2.w(this.h.h(j) >= 0, false);
            }
            charSequence2 = charSequence;
            charSequence = null;
            ut8 ut8Var22 = (ut8) view;
            if (z) {
            }
            ut8Var22.x(tLObject, null, charSequence, charSequence2, false, z);
            ut8Var22.w(this.h.h(j) >= 0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        ut8 ut8Var;
        View view;
        Context context = this.c;
        if (i == 0) {
            ut8 ut8Var2 = new ut8(context, null);
            ut8Var2.N0 = true;
            ut8Var2.F0 = true;
            ut8Var = ut8Var2;
        } else if (i == 1) {
            l55 l55Var = new l55(26, null, context);
            l55Var.setNoBackground(true);
            ut8Var = l55Var;
        } else {
            if (i != 3) {
                if (i == 4) {
                    view = new o72(context, (byte) 23);
                    view.setId(9);
                    view.setTag(-33024);
                } else if (i != 5) {
                    view = new xib(16, context, false);
                } else {
                    tk4 tk4Var = new tk4(context, null);
                    tk4Var.setIsSingleCell(true);
                    tk4Var.setViewType(29);
                    anb.h(cmb.c6, null, tk4Var);
                    ut8Var = tk4Var;
                }
                return new b59(view);
            }
            ut8 ut8Var3 = new ut8(context, null);
            ut8Var3.N0 = true;
            ut8Var3.F0 = true;
            ut8Var = ut8Var3;
        }
        view = ut8Var;
        return new b59(view);
    }
}
