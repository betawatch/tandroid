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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class sr9 extends n39 {
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
    public zr9 f;
    public vf6 h;
    public Timer n;
    public boolean r;
    public boolean s;
    public boolean w;
    public boolean x;
    public long y;

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return i == 0 || i == 2 || i == 3;
    }

    public final Object E(int i) {
        int size = this.d.size();
        int size2 = this.I.size();
        zr9 zr9Var = this.f;
        int size3 = zr9Var.e.size();
        ArrayList arrayList = zr9Var.j;
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
        return zr9Var.e.get(i3 - 1);
    }

    public abstract void F();

    public final void G(String str) {
        try {
            Timer timer = this.n;
            if (timer != null) {
                timer.cancel();
            }
        } catch (Exception e) {
            fa4.g(e, true);
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
        timer2.schedule(new ox2(this, str, (byte) 3), 200L, 300L);
    }

    @Override // w39
    public final int b() {
        zr9 zr9Var = this.f;
        this.K = -1;
        int size = this.d.size();
        if (!this.I.isEmpty()) {
            this.K = size;
            size += this.I.size() + 1;
        }
        int size2 = zr9Var.e.size();
        if (size2 != 0) {
            size += size2 + 1;
        }
        int size3 = zr9Var.j.size();
        return size3 != 0 ? size + size3 : size;
    }

    @Override // w39
    public final int d(int i) {
        Object E = E(i);
        if (E == null) {
            return 1;
        }
        return E instanceof String ? "section".equals((String) E) ? 1 : 2 : E instanceof nu2 ? 3 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b5  */
    @Override // w39
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(s49 s49Var, int i) {
        long j;
        boolean z;
        String str;
        CharSequence charSequence;
        CharSequence charSequence2;
        int y1;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0) {
            if (i2 == 1) {
                l35 l35Var = (l35) view;
                if (i == this.K) {
                    l35Var.setText(k96.M0(2131748915, null));
                    return;
                } else if (E(i) == null) {
                    l35Var.setText(k96.M0(2131749360, null));
                    return;
                } else {
                    l35Var.setText(k96.M0(2131747090, null));
                    return;
                }
            }
            if (i2 != 2) {
                if (i2 == 3) {
                    nu2 nu2Var = (nu2) E(i);
                    ((rr8) view).z(nu2Var, null, qu2.m(0, nu2Var.i, nu2Var.j), yjb.k(new StringBuilder("+"), (String) nu2Var.g.get(0), p38.f()), false, false);
                    return;
                }
                return;
            }
            String str2 = (String) E(i);
            wgb wgbVar = (wgb) view;
            wgbVar.g(-1, bkb.n6);
            wgbVar.k(k96.a0(null, null, 2131754449, p38.f().e("+" + str2)), false);
            return;
        }
        TLObject tLObject = (TLObject) E(i);
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) tLObject;
                str = l7c.p(user);
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
                str = hc2.K(chat, false);
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
                        if (str3 != null && (y1 = gl.y1(str, str3)) != -1) {
                            int length = str3.length();
                            if (y1 == 0) {
                                length++;
                            } else {
                                y1++;
                            }
                            spannableStringBuilder.setSpan(new cm4(bkb.p6, null), y1, length + y1, 33);
                        }
                        charSequence2 = spannableStringBuilder;
                    } catch (Exception e) {
                        fa4.g(e, true);
                        charSequence = null;
                        charSequence2 = str;
                    }
                }
                rr8 rr8Var = (rr8) view;
                if (z) {
                }
                rr8Var.z(tLObject, null, charSequence, charSequence2, false, z);
                rr8Var.y(this.h.h(j) >= 0, false);
            }
            charSequence = (CharSequence) this.e.get(i);
            if (charSequence == null || str == null || str.length() <= 0 || !charSequence.toString().startsWith("@".concat(str))) {
                charSequence2 = null;
                rr8 rr8Var2 = (rr8) view;
                if (z) {
                    charSequence = k96.M0(2131745709, null);
                }
                rr8Var2.z(tLObject, null, charSequence, charSequence2, false, z);
                rr8Var2.y(this.h.h(j) >= 0, false);
            }
            charSequence2 = charSequence;
            charSequence = null;
            rr8 rr8Var22 = (rr8) view;
            if (z) {
            }
            rr8Var22.z(tLObject, null, charSequence, charSequence2, false, z);
            rr8Var22.y(this.h.h(j) >= 0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        rr8 rr8Var;
        View view;
        Context context = this.c;
        if (i == 0) {
            rr8 rr8Var2 = new rr8(context, null);
            rr8Var2.N0 = true;
            rr8Var2.F0 = true;
            rr8Var = rr8Var2;
        } else if (i == 1) {
            l35 l35Var = new l35(26, null, context);
            l35Var.setNoBackground(true);
            rr8Var = l35Var;
        } else {
            if (i != 3) {
                if (i == 4) {
                    view = new d62(context, (byte) 23);
                    view.setId(9);
                    view.setTag(-33024);
                } else if (i != 5) {
                    view = new wgb(16, context, false);
                } else {
                    pi4 pi4Var = new pi4(context, null);
                    pi4Var.setIsSingleCell(true);
                    pi4Var.setViewType(29);
                    zkb.h(bkb.c6, null, pi4Var);
                    rr8Var = pi4Var;
                }
                return new y29(view);
            }
            rr8 rr8Var3 = new rr8(context, null);
            rr8Var3.N0 = true;
            rr8Var3.F0 = true;
            rr8Var = rr8Var3;
        }
        view = rr8Var;
        return new y29(view);
    }
}
