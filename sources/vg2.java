// default package

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vg2 extends q59 {
    public final /* synthetic */ wg2 E;
    public final Context c;
    public final bu9 h;
    public tg2 n;
    public boolean s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public vh6 e = new vh6();
    public ArrayList f = new ArrayList();
    public int r = 0;

    public vg2(wg2 wg2Var, Context context) {
        this.E = wg2Var;
        this.c = context;
        bu9 bu9Var = new bu9(true);
        this.h = bu9Var;
        bu9Var.a = new ug2(this);
    }

    @Override // y59
    public final void A(u69 u69Var) {
        View view = u69Var.a;
        if (view instanceof ij6) {
            ((ij6) view).a();
        }
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f != 1;
    }

    public final TLObject E(int i) {
        bu9 bu9Var = this.h;
        ArrayList arrayList = bu9Var.e;
        ArrayList arrayList2 = bu9Var.g;
        int size = arrayList2.size();
        if (size != 0) {
            int i2 = size + 1;
            if (i2 > i) {
                if (i != 0) {
                    return (TLObject) arrayList2.get(i - 1);
                }
                return null;
            }
            i -= i2;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i3 = size2 + 1;
            if (i3 > i) {
                if (i != 0) {
                    return (TLObject) this.d.get(i - 1);
                }
                return null;
            }
            i -= i3;
        }
        int size3 = arrayList.size();
        if (size3 == 0 || size3 + 1 <= i || i == 0) {
            return null;
        }
        return (TLObject) arrayList.get(i - 1);
    }

    public final void F(String str) {
        if (this.n != null) {
            Utilities.g.a(this.n);
            this.n = null;
        }
        this.d.clear();
        this.e.b();
        this.f.clear();
        this.h.f(null, null);
        bu9 bu9Var = this.h;
        wg2 wg2Var = this.E;
        byte b = 0;
        bu9Var.g(null, wg2Var.O != 0, false, true, false, sd2.T(wg2Var.n) ? this.E.N : 0L, false, this.E.O, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = true;
        this.E.b.e(true, true);
        mp3 mp3Var = Utilities.g;
        tg2 tg2Var = new tg2(this, str, b);
        this.n = tg2Var;
        mp3Var.d(tg2Var, 300L);
    }

    @Override // y59
    public final int b() {
        return this.r;
    }

    @Override // y59
    public final int d(int i) {
        return (i == this.y || i == this.w || i == this.x) ? 1 : 0;
    }

    @Override // y59
    public final void f() {
        fv fvVar;
        this.r = 0;
        bu9 bu9Var = this.h;
        int size = bu9Var.g.size();
        if (size != 0) {
            this.w = 0;
            this.r = size + 1 + this.r;
        } else {
            this.w = -1;
        }
        int size2 = this.d.size();
        if (size2 != 0) {
            int i = this.r;
            this.x = i;
            this.r = size2 + 1 + i;
        } else {
            this.x = -1;
        }
        int size3 = bu9Var.e.size();
        if (size3 != 0) {
            int i2 = this.r;
            this.y = i2;
            this.r = size3 + 1 + i2;
        } else {
            this.y = -1;
        }
        wg2 wg2Var = this.E;
        if (wg2Var.o1 && (fvVar = wg2Var.c) != null) {
            y59 adapter = fvVar.getAdapter();
            vg2 vg2Var = wg2Var.e;
            if (adapter != vg2Var) {
                fv fvVar2 = wg2Var.c;
                fvVar2.X1 = true;
                fvVar2.Y1 = false;
                fvVar2.setAdapter(vg2Var);
                wg2Var.c.setFastScrollVisible(false);
                wg2Var.c.setVerticalScrollBarEnabled(true);
            }
        }
        super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146 A[Catch: Exception -> 0x015e, TryCatch #0 {Exception -> 0x015e, blocks: (B:69:0x0135, B:71:0x0146, B:73:0x014c, B:74:0x0151, B:76:0x014f), top: B:68:0x0135 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0165 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0112  */
    /* JADX WARN: Type inference failed for: r14v2, types: [android.view.View, ij6] */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v7, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r15v9 */
    @Override // y59
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t(u69 u69Var, int i) {
        String str;
        TLObject tLObject;
        int size;
        String str2;
        boolean z;
        CharSequence charSequence;
        boolean z2;
        int i2;
        ?? r15;
        int y1;
        int size2;
        String str3;
        int y12;
        int size3;
        int i3;
        int i4 = u69Var.f;
        View view = u69Var.a;
        wg2 wg2Var = this.E;
        if (i4 != 0) {
            if (i4 == 1) {
                l55 l55Var = (l55) view;
                if (i != this.w) {
                    if (i == this.y) {
                        l55Var.setText(jb6.M0(2131749309, null));
                        return;
                    } else {
                        if (i == this.x) {
                            l55Var.setText(jb6.M0(2131751717, null));
                            return;
                        }
                        return;
                    }
                }
                int i5 = wg2Var.O;
                if (i5 == 0) {
                    l55Var.setText(jb6.M0(2131752397, null));
                    return;
                }
                if (i5 == 3) {
                    l55Var.setText(jb6.M0(2131752246, null));
                    return;
                } else if (wg2Var.s) {
                    l55Var.setText(jb6.M0(2131752227, null));
                    return;
                } else {
                    l55Var.setText(jb6.M0(2131752321, null));
                    return;
                }
            }
            return;
        }
        TLObject E = E(i);
        boolean z3 = E instanceof TLRPC.User;
        TLObject tLObject2 = E;
        if (!z3) {
            if (E instanceof TLRPC.ChannelParticipant) {
                long B1 = k47.B1(((TLRPC.ChannelParticipant) E).peer);
                if (B1 >= 0) {
                    TLRPC.User W1 = wg2Var.getMessagesController().W1(Long.valueOf(B1));
                    tLObject2 = W1;
                    if (W1 != null) {
                        str = m9c.p(W1);
                        tLObject = W1;
                    }
                } else {
                    TLRPC.Chat L0 = wg2Var.getMessagesController().L0(Long.valueOf(-B1));
                    tLObject2 = L0;
                    if (L0 != null) {
                        str = sd2.K(L0, false);
                        tLObject = L0;
                    }
                }
                bu9 bu9Var = this.h;
                size = bu9Var.g.size();
                if (size != 0) {
                    int i6 = size + 1;
                    if (i6 > i) {
                        str2 = bu9Var.n;
                        z = true;
                        if (!z && (size3 = this.d.size()) != 0) {
                            i3 = size3 + 1;
                            if (i3 <= i) {
                                charSequence = (CharSequence) this.f.get(i - 1);
                                if (charSequence != null && !TextUtils.isEmpty(str)) {
                                    if (charSequence.toString().startsWith("@" + str)) {
                                        i2 = i;
                                        z2 = true;
                                        r15 = 0;
                                        if (!z2 && str != null && (size2 = bu9Var.e.size()) != 0 && size2 + 1 > i2) {
                                            str3 = bu9Var.c;
                                            if (str3.startsWith("@")) {
                                                str3 = str3.substring(1);
                                            }
                                            try {
                                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                                                spannableStringBuilder.append((CharSequence) "@");
                                                spannableStringBuilder.append((CharSequence) str);
                                                y12 = gm.y1(str, str3);
                                                if (y12 != -1) {
                                                    int length = str3.length();
                                                    if (y12 == 0) {
                                                        length++;
                                                    } else {
                                                        y12++;
                                                    }
                                                    spannableStringBuilder.setSpan(new do4(cmb.p6, null), y12, length + y12, 33);
                                                }
                                                charSequence = spannableStringBuilder;
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                charSequence = str;
                                            }
                                        }
                                        if (str2 != null && str != null) {
                                            r15 = new SpannableStringBuilder(str);
                                            y1 = gm.y1(str, str2);
                                            if (y1 != -1) {
                                                r15.setSpan(new do4(cmb.p6, null), y1, str2.length() + y1, 33);
                                            }
                                        }
                                        ?? r14 = (ij6) view;
                                        r14.setTag(Integer.valueOf(i2));
                                        r14.c(tLObject, r15, charSequence, false);
                                    }
                                }
                                i2 = i;
                                z2 = true;
                                r15 = charSequence;
                                charSequence = null;
                                if (!z2) {
                                    str3 = bu9Var.c;
                                    if (str3.startsWith("@")) {
                                    }
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) "@");
                                    spannableStringBuilder2.append((CharSequence) str);
                                    y12 = gm.y1(str, str3);
                                    if (y12 != -1) {
                                    }
                                    charSequence = spannableStringBuilder2;
                                }
                                if (str2 != null) {
                                    r15 = new SpannableStringBuilder(str);
                                    y1 = gm.y1(str, str2);
                                    if (y1 != -1) {
                                    }
                                }
                                ?? r142 = (ij6) view;
                                r142.setTag(Integer.valueOf(i2));
                                r142.c(tLObject, r15, charSequence, false);
                            }
                            i -= i3;
                        }
                        charSequence = null;
                        z2 = z;
                        i2 = i;
                        r15 = 0;
                        if (!z2) {
                        }
                        if (str2 != null) {
                        }
                        ?? r1422 = (ij6) view;
                        r1422.setTag(Integer.valueOf(i2));
                        r1422.c(tLObject, r15, charSequence, false);
                    }
                    i -= i6;
                }
                str2 = null;
                z = false;
                if (!z) {
                    i3 = size3 + 1;
                    if (i3 <= i) {
                    }
                }
                charSequence = null;
                z2 = z;
                i2 = i;
                r15 = 0;
                if (!z2) {
                }
                if (str2 != null) {
                }
                ?? r14222 = (ij6) view;
                r14222.setTag(Integer.valueOf(i2));
                r14222.c(tLObject, r15, charSequence, false);
            }
            if (!(E instanceof TLRPC.ChatParticipant)) {
                return;
            } else {
                tLObject2 = wg2Var.getMessagesController().W1(Long.valueOf(((TLRPC.ChatParticipant) E).user_id));
            }
        }
        str = null;
        tLObject = tLObject2;
        bu9 bu9Var2 = this.h;
        size = bu9Var2.g.size();
        if (size != 0) {
        }
        str2 = null;
        z = false;
        if (!z) {
        }
        charSequence = null;
        z2 = z;
        i2 = i;
        r15 = 0;
        if (!z2) {
        }
        if (str2 != null) {
        }
        ?? r142222 = (ij6) view;
        r142222.setTag(Integer.valueOf(i2));
        r142222.c(tLObject, r15, charSequence, false);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        ylb ylbVar;
        wg2 wg2Var = this.E;
        if (i != 0) {
            ylbVar = ((d) wg2Var).resourceProvider;
            view = new l55(26, ylbVar, this.c);
            view.setBackground(null);
        } else {
            ij6 ij6Var = new ij6(this.c, 2, 2, wg2Var.e1 == 0, null);
            ij6Var.H = true;
            ij6Var.setDelegate(new ug2(this));
            view = ij6Var;
        }
        return new b59(view);
    }
}
