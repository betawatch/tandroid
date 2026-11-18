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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.Components.ij0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public final /* synthetic */ z40 J;
    public final Context c;
    public final jg.z1 f;
    public Runnable h;
    public boolean n;
    public int s;
    public int w;
    public int x;
    public int y;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public final ArrayList r = new ArrayList();

    public x40(z40 z40Var, Context context) {
        TLRPC.Chat O0;
        TLRPC.User c22;
        this.J = z40Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.i5 contactsController = z40Var.getContactsController();
        boolean z10 = z40Var.R;
        ArrayList arrayList = contactsController.f0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User c23 = z40Var.getMessagesController().c2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (c23 != null && !c23.self && !c23.deleted) {
                this.r.add(c23);
                hashSet.add(Long.valueOf(c23.id));
            }
        }
        if (z40Var.Q || z40Var.P || z10) {
            ArrayList arrayList2 = z40Var.getMessagesController().y;
            if (z10) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.n5.E(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (c22 = z40Var.getMessagesController().c2(Long.valueOf(dialog.id))) != null && !org.telegram.messenger.o10.y(c22) && !org.telegram.messenger.o10.C(c22) && !org.telegram.messenger.o10.u(c22) && !org.telegram.messenger.o10.B(dialog.id) && !org.telegram.messenger.mp.L2(c22)) {
                        this.r.add(c22);
                        hashSet.add(Long.valueOf(c22.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.n5.z(dialog2.id) && (O0 = z40Var.getMessagesController().O0(Long.valueOf(-dialog2.id))) != null && O0.migrated_to == null && (!org.telegram.messenger.v3.T(O0) || O0.megagroup)) {
                        this.r.add(O0);
                    }
                }
            }
            Collections.sort(this.r, new t40());
            TLObject tLObject = null;
            int i12 = 0;
            while (i12 < this.r.size()) {
                TLObject tLObject2 = (TLObject) this.r.get(i12);
                if (tLObject != null) {
                    String a10 = t40.a(tLObject);
                    String substring = TextUtils.isEmpty(a10) ? "" : a10.substring(0, 1);
                    String a11 = t40.a(tLObject2);
                    if (substring.equals(TextUtils.isEmpty(a11) ? "" : a11.substring(0, 1))) {
                        i12++;
                        tLObject = tLObject2;
                    }
                }
                ArrayList arrayList3 = this.r;
                String a12 = t40.a(tLObject2);
                arrayList3.add(i12, new y40(TextUtils.isEmpty(a12) ? "" : a12.substring(0, 1)));
                i12++;
                tLObject = tLObject2;
            }
        }
        jg.z1 z1Var = new jg.z1(false);
        this.f = z1Var;
        z1Var.a = new zr(this, 13);
    }

    @Override // v4.i0
    public final void A(v4.f1 f1Var) {
        View view = f1Var.a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        if (f1Var.f == 0) {
            return false;
        }
        z40 z40Var = this.J;
        if (z40Var.K == null) {
            return true;
        }
        View view = f1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.h4) view).getObject();
        return !(object instanceof TLRPC.User) || z40Var.K.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.ij0
    public final String F(int i7) {
        String str;
        String str2;
        if (this.n || i7 < this.F) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = this.F;
        if (i7 >= size + i10) {
            return null;
        }
        TLObject tLObject = (TLObject) arrayList.get(i7 - i10);
        if (tLObject instanceof y40) {
            return ((y40) tLObject).a;
        }
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            str = user.first_name;
            str2 = user.last_name;
        } else {
            str = ((TLRPC.Chat) tLObject).title;
            str2 = "";
        }
        if (org.telegram.messenger.gd.b0 == 1) {
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

    @Override // org.telegram.ui.Components.ij0
    public final void G(org.telegram.ui.Components.ck0 ck0Var, float f10, int[] iArr) {
        iArr[0] = (int) (b() * f10);
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
        jg.z1 z1Var = this.f;
        z40 z40Var = this.J;
        z1Var.g(null, true, z40Var.P || z40Var.Q, false, false, 0L, false, 0, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.q5 q5Var = Utilities.g;
        w40 w40Var = new w40(this, str, 0);
        this.h = w40Var;
        q5Var.d(w40Var, 300L);
    }

    @Override // v4.i0
    public final int b() {
        int i7;
        z40 z40Var = this.J;
        long j3 = z40Var.I;
        long j10 = z40Var.H;
        this.H = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.E = -1;
        if (this.n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.e.size();
            int i10 = size + size2;
            if (size3 != 0) {
                i10 += size3 + 1;
            }
            this.I = i10;
            return i10;
        }
        if (z40Var.R) {
            this.x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z40Var.W) {
            int i11 = i7 + 1;
            this.w = i7;
            this.s = i7;
            i7 += 2;
            this.y = i11;
        } else if (z40Var.X) {
            int i12 = i7 + 1;
            this.w = i7;
            this.s = i7;
            i7 += 2;
            this.E = i12;
        } else {
            this.w = i7;
        }
        this.F = i7;
        int size4 = this.r.size() + i7;
        if (z40Var.S) {
            if (j10 != 0) {
                this.G = org.telegram.messenger.v3.y(3, z40Var.getMessagesController().O0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat O0 = z40Var.getMessagesController().O0(Long.valueOf(j3));
                this.G = (!org.telegram.messenger.v3.y(3, O0) || org.telegram.messenger.v3.t0(O0)) ? 0 : 2;
            } else {
                this.G = 0;
            }
            if (this.G != 0) {
                this.F++;
                size4++;
            }
        }
        if (size4 == 0) {
            this.H = 0;
            size4++;
        }
        this.I = size4;
        return size4;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (this.n) {
            return i7 == this.f.d.size() + this.d.size() ? 0 : 1;
        }
        if (i7 == this.x) {
            return 2;
        }
        if (i7 == this.s) {
            return 0;
        }
        if (i7 == this.y || i7 == this.E) {
            return 1;
        }
        if (this.G != 0 && i7 == 0) {
            return 2;
        }
        if (this.H == i7) {
            return 3;
        }
        int i10 = i7 - this.F;
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i10 >= arrayList.size() || !(arrayList.get(i7 - this.F) instanceof y40)) ? 1 : 0;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        this.J.w0();
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String K;
        int i10 = f1Var.f;
        View view = f1Var.a;
        ArrayList arrayList = this.r;
        z40 z40Var = this.J;
        CharSequence charSequence3 = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (this.n) {
                x3Var.setText(org.telegram.messenger.gd.M0(2131749360, null));
            } else if (i7 == this.s) {
                x3Var.setText(org.telegram.messenger.gd.M0(2131746575, null));
            } else {
                int i11 = i7 - this.F;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.F);
                    if (tLObject2 instanceof y40) {
                        x3Var.setText(((y40) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i7 == this.w) {
                x3Var.a((z40Var.Y == null && z40Var.a0.i()) ? "" : org.telegram.messenger.gd.M0(2131751446, null), new j40(this, r4 ? 1 : 0));
                return;
            }
            return;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
            if (i7 == this.x) {
                m8Var.o(R.drawable.menu_link_create2, org.telegram.messenger.gd.M0(2131749293, null), false);
                m8Var.g(org.telegram.ui.ActionBar.n6.v6, org.telegram.ui.ActionBar.n6.u6);
                return;
            } else if (this.G == 2) {
                m8Var.o(R.drawable.msg_link2, org.telegram.messenger.gd.M0(2131752391, null), false);
                m8Var.g(org.telegram.ui.ActionBar.n6.m6, org.telegram.ui.ActionBar.n6.G6);
                return;
            } else {
                m8Var.o(R.drawable.msg_link2, org.telegram.messenger.gd.M0(2131748918, null), false);
                m8Var.g(org.telegram.ui.ActionBar.n6.m6, org.telegram.ui.ActionBar.n6.G6);
                return;
            }
        }
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) view;
        if (this.n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f;
            ArrayList arrayList2 = z1Var.e;
            ArrayList arrayList3 = z1Var.d;
            int size2 = arrayList2.size();
            int size3 = arrayList3.size();
            tLObject = (i7 < 0 || i7 >= size) ? (i7 < size || i7 >= size3 + size) ? (i7 <= size + size3 || i7 > (size2 + size) + size3) ? null : (TLObject) z1Var.e.get(((i7 - size) - size3) - 1) : (TLObject) arrayList3.get(i7 - size) : (TLObject) this.d.get(i7);
            if (tLObject != null) {
                if (tLObject instanceof TLRPC.User) {
                    K = ((TLRPC.User) tLObject).username;
                } else if (!(tLObject instanceof TLRPC.Chat)) {
                    return;
                } else {
                    K = org.telegram.messenger.v3.K((TLRPC.Chat) tLObject, false);
                }
                if (i7 < size) {
                    charSequence2 = (CharSequence) this.e.get(i7);
                    if (charSequence2 != null && !TextUtils.isEmpty(K)) {
                        if (charSequence2.toString().startsWith("@" + K)) {
                            charSequence3 = charSequence2;
                            charSequence2 = null;
                        }
                    }
                } else if (i7 > size && !TextUtils.isEmpty(K)) {
                    String str = z1Var.c;
                    if (str.startsWith("@")) {
                        str = str.substring(1);
                    }
                    try {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        spannableStringBuilder.append((CharSequence) "@");
                        spannableStringBuilder.append((CharSequence) K);
                        int A1 = org.telegram.messenger.g0.A1(K, str);
                        if (A1 != -1) {
                            int length = str.length();
                            if (A1 == 0) {
                                length++;
                            } else {
                                A1++;
                            }
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i00(org.telegram.ui.ActionBar.n6.q6, null), A1, length + A1, 33);
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
            if (i7 == this.y) {
                h4Var.r = true;
                h4Var.f = "premium";
                h4Var.a.setImageDrawable(org.telegram.ui.Cells.h4.b(h4Var.getContext(), false));
                h4Var.b.l(org.telegram.messenger.gd.M0(2131746587, null), false);
                org.telegram.ui.ActionBar.n5 n5Var = h4Var.c;
                int i12 = org.telegram.ui.ActionBar.n6.y6;
                n5Var.setTag(Integer.valueOf(i12));
                if (h4Var.L) {
                    i12 = org.telegram.ui.ActionBar.n6.fh;
                }
                org.telegram.ui.ActionBar.u6.X(n5Var, i12, h4Var.N);
                n5Var.setEmojiColor(n5Var.getTextColor());
                n5Var.l(org.telegram.messenger.gd.M0(2131746585, null), false);
                h4Var.c(z40Var.Y != null, false);
                return;
            }
            if (i7 == this.E) {
                h4Var.s = true;
                h4Var.f = "miniapps";
                org.telegram.ui.Components.q9 q9Var = h4Var.a;
                h4Var.getContext();
                q9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.b.l(org.telegram.messenger.gd.M0(2131746613, null), false);
                org.telegram.ui.ActionBar.n5 n5Var2 = h4Var.c;
                int i13 = org.telegram.ui.ActionBar.n6.y6;
                n5Var2.setTag(Integer.valueOf(i13));
                if (h4Var.L) {
                    i13 = org.telegram.ui.ActionBar.n6.fh;
                }
                org.telegram.ui.ActionBar.u6.X(n5Var2, i13, h4Var.N);
                n5Var2.setEmojiColor(n5Var2.getTextColor());
                n5Var2.l(org.telegram.messenger.gd.M0(2131746612, null), false);
                h4Var.c(z40Var.Z != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i7 - this.F);
            charSequence = null;
        }
        h4Var.d(tLObject, charSequence3, charSequence);
        long j3 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j3 != 0) {
            a0.h hVar = z40Var.K;
            if (hVar == null || hVar.h(j3) < 0) {
                h4Var.c(z40Var.a0.h(j3) >= 0, false);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        Context context = this.c;
        if (i7 == 0) {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        } else if (i7 == 1) {
            x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        } else if (i7 != 3) {
            x3Var = new org.telegram.ui.Cells.m8(context);
        } else {
            org.telegram.ui.Components.a60 a60Var = new org.telegram.ui.Components.a60(context, null, 0, null, 1);
            a60Var.setLayoutParams(new v4.q0(-1, -1));
            a60Var.e.setVisibility(8);
            a60Var.d.setText(org.telegram.messenger.gd.M0(2131748031, null));
            a60Var.setAnimateLayoutChange(true);
            x3Var = a60Var;
        }
        return new org.telegram.ui.Components.kj0(x3Var);
    }
}
