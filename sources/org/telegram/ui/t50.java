package org.telegram.ui;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t50 extends org.telegram.ui.Components.ak0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final /* synthetic */ v50 I;
    public final Context c;
    public final zf.m1 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public t50(v50 v50Var, Context context) {
        TLRPC.Chat L0;
        TLRPC.User Z1;
        this.I = v50Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.i5 contactsController = v50Var.getContactsController();
        boolean z10 = v50Var.Q;
        ArrayList arrayList = contactsController.e0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.User Z12 = v50Var.getMessagesController().Z1(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i10)).user_id));
            if (Z12 != null && !Z12.self && !Z12.deleted) {
                this.r.add(Z12);
                hashSet.add(Long.valueOf(Z12.id));
            }
        }
        if (v50Var.P || v50Var.O || z10) {
            ArrayList arrayList2 = v50Var.getMessagesController().y;
            if (z10) {
                int size = arrayList2.size();
                for (int i11 = 0; i11 < size; i11++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.o5.E(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (Z1 = v50Var.getMessagesController().Z1(Long.valueOf(dialog.id))) != null && !org.telegram.messenger.h20.x(Z1) && !org.telegram.messenger.h20.B(Z1) && !org.telegram.messenger.h20.t(Z1) && !org.telegram.messenger.h20.A(dialog.id) && !org.telegram.messenger.vp.E2(Z1)) {
                        this.r.add(Z1);
                        hashSet.add(Long.valueOf(Z1.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i12 = 0; i12 < size2; i12++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i12);
                    if (org.telegram.messenger.o5.z(dialog2.id) && (L0 = v50Var.getMessagesController().L0(Long.valueOf(-dialog2.id))) != null && L0.migrated_to == null && (!org.telegram.messenger.w3.T(L0) || L0.megagroup)) {
                        this.r.add(L0);
                    }
                }
            }
            Collections.sort(this.r, new p50());
            TLObject tLObject = null;
            int i13 = 0;
            while (i13 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i13);
                if (tLObject != null) {
                    String a2 = p50.a(tLObject);
                    String substring = TextUtils.isEmpty(a2) ? "" : a2.substring(0, 1);
                    String a10 = p50.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1))) {
                        i13++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.r;
                String a11 = p50.a(tLObject2);
                arrayList3.add(i13, new u50(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1)));
                i13++;
                tLObject = tLObject2;
            }
        }
        zf.m1 m1Var = new zf.m1(false);
        this.f = m1Var;
        m1Var.a = new tt(this, 12);
    }

    @Override // s4.g0
    public final void A(s4.c1 c1Var) {
        View view = c1Var.a;
        if (view instanceof org.telegram.ui.Cells.j4) {
            ((org.telegram.ui.Cells.j4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f == 0) {
            return false;
        }
        v50 v50Var = this.I;
        if (v50Var.J == null) {
            return true;
        }
        View view = c1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.j4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.j4) view).getObject();
        return !(object instanceof TLRPC.User) || v50Var.J.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.ak0
    public final String F(int i10) {
        String str;
        String str2;
        if (this.n || i10 < this.E) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i11 = this.E;
        if (i10 >= size + i11) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i10 - i11);
        if (tLObject instanceof u50) {
            return ((u50) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (org.telegram.messenger.cd.Y == 1) {
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
        } else {
            if (!TextUtils.isEmpty(str2)) {
                return str2.substring(0, 1).toUpperCase();
            }
            if (!TextUtils.isEmpty(str)) {
                return str.substring(0, 1).toUpperCase();
            }
        }
        return "";
    }

    @Override // org.telegram.ui.Components.ak0
    public final void G(org.telegram.ui.Components.tk0 tk0Var, float f7, int[] iArr) {
        iArr[0] = (int) (b() * f7);
        iArr[1] = 0;
    }

    public final void L(String str) {
        if (this.h != null) {
            Utilities.g.a(this.h);
            this.h = null;
        }
        this.d.clear();
        this.e.clear();
        this.f.f(null, null);
        zf.m1 m1Var = this.f;
        v50 v50Var = this.I;
        m1Var.g(null, true, v50Var.O || v50Var.P, false, false, 0L, false, 0, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.r5 r5Var = Utilities.g;
        s50 s50Var = new s50(this, str, 0);
        this.h = s50Var;
        r5Var.d(s50Var, 300L);
    }

    @Override // s4.g0
    public final int b() {
        int i10;
        v50 v50Var = this.I;
        long j10 = v50Var.H;
        long j11 = v50Var.G;
        this.G = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.D = -1;
        if (this.n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f;
            int size2 = m1Var.d.size();
            int size3 = m1Var.e.size();
            int i11 = size + size2;
            if (size3 != 0) {
                i11 += size3 + 1;
            }
            this.H = i11;
            return i11;
        }
        if (v50Var.Q) {
            this.x = 0;
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (v50Var.V) {
            int i12 = i10 + 1;
            this.w = i10;
            this.s = i10;
            i10 += 2;
            this.y = i12;
        } else if (v50Var.W) {
            int i13 = i10 + 1;
            this.w = i10;
            this.s = i10;
            i10 += 2;
            this.D = i13;
        } else {
            this.w = i10;
        }
        this.E = i10;
        int size4 = this.r.size() + i10;
        if (v50Var.R) {
            if (j11 != 0) {
                this.F = org.telegram.messenger.w3.y(3, v50Var.getMessagesController().L0(Long.valueOf(j11))) ? 1 : 0;
            } else if (j10 != 0) {
                TLRPC.Chat L0 = v50Var.getMessagesController().L0(Long.valueOf(j10));
                this.F = (!org.telegram.messenger.w3.y(3, L0) || org.telegram.messenger.w3.t0(L0)) ? 0 : 2;
            } else {
                this.F = 0;
            }
            if (this.F != 0) {
                this.E++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.G = 0;
            size4++;
        }
        this.H = size4;
        return size4;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (this.n) {
            return i10 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i10 == this.x) {
            return 2;
        }
        if (i10 == this.s) {
            return 0;
        }
        if (i10 == this.y || i10 == this.D) {
            return 1;
        }
        if (this.F != 0 && i10 == 0) {
            return 2;
        }
        if (this.G == i10) {
            return 3;
        }
        int i11 = i10 - this.E;
        if (i11 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i11 >= arrayList.size() || !(arrayList.get(i10 - this.E) instanceof u50)) ? 1 : 0;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        this.I.v0();
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String K;
        int i11 = c1Var.f;
        View view = c1Var.a;
        ArrayList arrayList = this.r;
        v50 v50Var = this.I;
        CharSequence charSequence3 = null;
        if (i11 == 0) {
            org.telegram.ui.Cells.z3 z3Var = (org.telegram.ui.Cells.z3) view;
            if (this.n) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131749544, null));
            } else if (i10 == this.s) {
                z3Var.setText(org.telegram.messenger.cd.L0(2131746783, null));
            } else {
                int i12 = i10 - this.E;
                if (i12 >= 0 && i12 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i10 - this.E);
                    if (tLObject2 instanceof u50) {
                        z3Var.setText(((u50) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i10 == this.w) {
                z3Var.a((v50Var.X == null && v50Var.Z.i()) ? "" : org.telegram.messenger.cd.L0(2131751458, null), new f50(this, r4 ? 1 : 0));
                return;
            }
            return;
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return;
            }
            org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
            if (i10 == this.x) {
                p8Var.o(R.drawable.menu_link_create2, org.telegram.messenger.cd.L0(2131749494, null), false);
                p8Var.g(org.telegram.ui.ActionBar.t6.v6, org.telegram.ui.ActionBar.t6.u6);
                return;
            } else if (this.F == 2) {
                p8Var.o(R.drawable.msg_link2, org.telegram.messenger.cd.L0(2131752402, null), false);
                p8Var.g(org.telegram.ui.ActionBar.t6.m6, org.telegram.ui.ActionBar.t6.G6);
                return;
            } else {
                p8Var.o(R.drawable.msg_link2, org.telegram.messenger.cd.L0(2131749120, null), false);
                p8Var.g(org.telegram.ui.ActionBar.t6.m6, org.telegram.ui.ActionBar.t6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
        if (this.n) {
            int size = this.d.size();
            zf.m1 m1Var = this.f;
            ArrayList arrayList2 = m1Var.e;
            ArrayList arrayList3 = m1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i10 < 0 || i10 >= size) ? (i10 < size || i10 >= size3 + size) ? (i10 <= size + size3 || i10 > (size2 + size) + size3) ? null : (TLObject) m1Var.e.get(((i10 - size) - size3) - 1) : (TLObject) arrayList3.get(i10 - size) : (TLObject) this.d.get(i10);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    K = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    K = org.telegram.messenger.w3.K((TLRPC.Chat) tLObject, false);
                }
                if (i10 < size) {
                    charSequence2 = (CharSequence) this.e.get(i10);
                    if (charSequence2 != null && !TextUtils.isEmpty(K)) {
                        if (charSequence2.toString().startsWith("@" + K)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i10 > size && !TextUtils.isEmpty(K)) {
                    String str = m1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) K);
                        int A1 = org.telegram.messenger.i0.A1(K, str);
                        if (A1 != -1) {
                            int length = str.length();
                            if (A1 == 0) {
                                length++;
                            } else {
                                A1++;
                            }
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.q6, null), A1, length + A1, 33);
                        }
                        charSequence2 = null;
                        charSequence3 = spannableStringBuilder;
                    } catch (Exception unused) {
                        charSequence2 = null;
                        charSequence3 = K;
                    }
                }
                CharSequence charSequence4 = charSequence3;
                charSequence3 = charSequence2;
                charSequence = charSequence4;
            }
            charSequence2 = null;
            CharSequence charSequence42 = charSequence3;
            charSequence3 = charSequence2;
            charSequence = charSequence42;
        } else {
            if (i10 == this.y) {
                j4Var.r = true;
                j4Var.f = "premium";
                j4Var.a.setImageDrawable(org.telegram.ui.Cells.j4.b(j4Var.getContext(), false));
                j4Var.b.l(org.telegram.messenger.cd.L0(2131746795, null), false);
                org.telegram.ui.ActionBar.u5 u5Var = j4Var.c;
                int i13 = org.telegram.ui.ActionBar.t6.y6;
                u5Var.setTag(Integer.valueOf(i13));
                if (j4Var.K) {
                    i13 = org.telegram.ui.ActionBar.t6.ch;
                }
                org.telegram.ui.ActionBar.a7.Y(u5Var, i13, j4Var.M);
                u5Var.setEmojiColor(u5Var.getTextColor());
                u5Var.l(org.telegram.messenger.cd.L0(2131746793, null), false);
                j4Var.c(v50Var.X != null, false);
                return;
            }
            if (i10 == this.D) {
                j4Var.s = true;
                j4Var.f = "miniapps";
                org.telegram.ui.Components.g9 g9Var = j4Var.a;
                j4Var.getContext();
                g9Var.setImageDrawable(org.telegram.ui.Cells.j4.a(false));
                j4Var.b.l(org.telegram.messenger.cd.L0(2131746821, null), false);
                org.telegram.ui.ActionBar.u5 u5Var2 = j4Var.c;
                int i14 = org.telegram.ui.ActionBar.t6.y6;
                u5Var2.setTag(Integer.valueOf(i14));
                if (j4Var.K) {
                    i14 = org.telegram.ui.ActionBar.t6.ch;
                }
                org.telegram.ui.ActionBar.a7.Y(u5Var2, i14, j4Var.M);
                u5Var2.setEmojiColor(u5Var2.getTextColor());
                u5Var2.l(org.telegram.messenger.cd.L0(2131746820, null), false);
                j4Var.c(v50Var.Y != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i10 - this.E);
            charSequence = null;
        }
        j4Var.d(tLObject, charSequence3, charSequence);
        long j10 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j10 != 0) {
            a0.h hVar = v50Var.J;
            if (hVar == null || hVar.h(j10) < 0) {
                j4Var.c(v50Var.Z.h(j10) >= 0, false);
                j4Var.setCheckBoxEnabled(true);
            } else {
                j4Var.c(true, false);
                j4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View z3Var;
        Context context = this.c;
        if (i10 == 0) {
            z3Var = new org.telegram.ui.Cells.z3(context, null);
        } else if (i10 == 1) {
            z3Var = new org.telegram.ui.Cells.j4(context, 1, 0, false);
        } else if (i10 != 3) {
            z3Var = new org.telegram.ui.Cells.p8(context);
        } else {
            org.telegram.ui.Components.f60 f60Var = new org.telegram.ui.Components.f60(context, null, 0, null, 1);
            f60Var.setLayoutParams(new s4.o0(-1, -1));
            f60Var.e.setVisibility(8);
            f60Var.d.setText(org.telegram.messenger.cd.L0(2131748240, null));
            f60Var.setAnimateLayoutChange(true);
            z3Var = f60Var;
        }
        return new org.telegram.ui.Components.ck0(z3Var);
    }
}
