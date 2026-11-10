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

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class x40 extends org.telegram.ui.Components.vi0 {
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public final /* synthetic */ z40 I;
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
        TLRPC.Chat M0;
        TLRPC.User a22;
        this.I = z40Var;
        this.c = context;
        HashSet hashSet = new HashSet();
        org.telegram.messenger.g5 contactsController = z40Var.getContactsController();
        boolean z9 = z40Var.Q;
        ArrayList arrayList = contactsController.e0;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.User a23 = z40Var.getMessagesController().a2(Long.valueOf(((TLRPC.TL_contact) arrayList.get(i7)).user_id));
            if (a23 != null && !a23.self && !a23.deleted) {
                this.r.add(a23);
                hashSet.add(Long.valueOf(a23.id));
            }
        }
        if (z40Var.P || z40Var.O || z9) {
            ArrayList arrayList2 = z40Var.getMessagesController().y;
            if (z9) {
                int size = arrayList2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
                    if (org.telegram.messenger.m5.E(dialog.id) && !hashSet.contains(Long.valueOf(dialog.id)) && (a22 = z40Var.getMessagesController().a2(Long.valueOf(dialog.id))) != null && !org.telegram.messenger.t10.x(a22) && !org.telegram.messenger.t10.B(a22) && !org.telegram.messenger.t10.t(a22) && !org.telegram.messenger.t10.A(dialog.id) && !org.telegram.messenger.qp.F2(a22)) {
                        this.r.add(a22);
                        hashSet.add(Long.valueOf(a22.id));
                    }
                }
            } else {
                int size2 = arrayList2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList2.get(i11);
                    if (org.telegram.messenger.m5.z(dialog2.id) && (M0 = z40Var.getMessagesController().M0(Long.valueOf(-dialog2.id))) != null && M0.migrated_to == null && (!org.telegram.messenger.t3.T(M0) || M0.megagroup)) {
                        this.r.add(M0);
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

    @Override // v4.g0
    public final void A(v4.d1 d1Var) {
        View view = d1Var.a;
        if (view instanceof org.telegram.ui.Cells.h4) {
            ((org.telegram.ui.Cells.h4) view).a.getImageReceiver().c();
        }
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        if (d1Var.f == 0) {
            return false;
        }
        z40 z40Var = this.I;
        if (z40Var.J == null) {
            return true;
        }
        View view = d1Var.a;
        if (!(view instanceof org.telegram.ui.Cells.h4)) {
            return true;
        }
        Object object = ((org.telegram.ui.Cells.h4) view).getObject();
        return !(object instanceof TLRPC.User) || z40Var.J.h(((TLRPC.User) object).id) < 0;
    }

    @Override // org.telegram.ui.Components.vi0
    public final String F(int i7) {
        String str;
        String str2;
        if (this.n || i7 < this.E) {
            return null;
        }
        ArrayList arrayList = this.r;
        int size = arrayList.size();
        int i10 = this.E;
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
        if (org.telegram.messenger.id.b0 == 1) {
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

    @Override // org.telegram.ui.Components.vi0
    public final void G(org.telegram.ui.Components.pj0 pj0Var, float f10, int[] iArr) {
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
        z40 z40Var = this.I;
        z1Var.g(null, true, z40Var.O || z40Var.P, false, false, 0L, false, 0, 0);
        f();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        org.telegram.messenger.p5 p5Var = Utilities.g;
        w40 w40Var = new w40(this, str, 0);
        this.h = w40Var;
        p5Var.d(w40Var, 300L);
    }

    @Override // v4.g0
    public final int b() {
        int i7;
        z40 z40Var = this.I;
        long j3 = z40Var.H;
        long j10 = z40Var.G;
        this.G = -1;
        this.s = -1;
        this.x = -1;
        this.w = -1;
        this.y = -1;
        this.D = -1;
        if (this.n) {
            int size = this.d.size();
            jg.z1 z1Var = this.f;
            int size2 = z1Var.d.size();
            int size3 = z1Var.e.size();
            int i10 = size + size2;
            if (size3 != 0) {
                i10 += size3 + 1;
            }
            this.H = i10;
            return i10;
        }
        if (z40Var.Q) {
            this.x = 0;
            i7 = 1;
        } else {
            i7 = 0;
        }
        if (z40Var.V) {
            int i11 = i7 + 1;
            this.w = i7;
            this.s = i7;
            i7 += 2;
            this.y = i11;
        } else if (z40Var.W) {
            int i12 = i7 + 1;
            this.w = i7;
            this.s = i7;
            i7 += 2;
            this.D = i12;
        } else {
            this.w = i7;
        }
        this.E = i7;
        int size4 = this.r.size() + i7;
        if (z40Var.R) {
            if (j10 != 0) {
                this.F = org.telegram.messenger.t3.y(3, z40Var.getMessagesController().M0(Long.valueOf(j10))) ? 1 : 0;
            } else if (j3 != 0) {
                TLRPC.Chat M0 = z40Var.getMessagesController().M0(Long.valueOf(j3));
                this.F = (!org.telegram.messenger.t3.y(3, M0) || org.telegram.messenger.t3.t0(M0)) ? 0 : 2;
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

    @Override // v4.g0
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
        if (i7 == this.y || i7 == this.D) {
            return 1;
        }
        if (this.F != 0 && i7 == 0) {
            return 2;
        }
        if (this.G == i7) {
            return 3;
        }
        int i10 = i7 - this.E;
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.r;
        return (i10 >= arrayList.size() || !(arrayList.get(i7 - this.E) instanceof y40)) ? 1 : 0;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        this.I.w0();
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        TLObject tLObject;
        CharSequence charSequence;
        CharSequence charSequence2;
        String K;
        int i10 = d1Var.f;
        View view = d1Var.a;
        ArrayList arrayList = this.r;
        z40 z40Var = this.I;
        CharSequence charSequence3 = null;
        if (i10 == 0) {
            org.telegram.ui.Cells.x3 x3Var = (org.telegram.ui.Cells.x3) view;
            if (this.n) {
                x3Var.setText(org.telegram.messenger.id.M0(2131749535, null));
            } else if (i7 == this.s) {
                x3Var.setText(org.telegram.messenger.id.M0(2131746768, null));
            } else {
                int i11 = i7 - this.E;
                if (i11 >= 0 && i11 < arrayList.size()) {
                    TLObject tLObject2 = (TLObject) arrayList.get(i7 - this.E);
                    if (tLObject2 instanceof y40) {
                        x3Var.setText(((y40) tLObject2).a.toUpperCase());
                    }
                }
            }
            if (i7 == this.w) {
                x3Var.a((z40Var.X == null && z40Var.Z.i()) ? "" : org.telegram.messenger.id.M0(2131751457, null), new j40(this, r4 ? 1 : 0));
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
                m8Var.o(R.drawable.menu_link_create2, org.telegram.messenger.id.M0(2131749485, null), false);
                m8Var.g(org.telegram.ui.ActionBar.m6.v6, org.telegram.ui.ActionBar.m6.u6);
                return;
            } else if (this.F == 2) {
                m8Var.o(R.drawable.msg_link2, org.telegram.messenger.id.M0(2131752402, null), false);
                m8Var.g(org.telegram.ui.ActionBar.m6.m6, org.telegram.ui.ActionBar.m6.G6);
                return;
            } else {
                m8Var.o(R.drawable.msg_link2, org.telegram.messenger.id.M0(2131749110, null), false);
                m8Var.g(org.telegram.ui.ActionBar.m6.m6, org.telegram.ui.ActionBar.m6.G6);
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
                    K = org.telegram.messenger.t3.K((TLRPC.Chat) tLObject, false);
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
                            spannableStringBuilder.setSpan(new org.telegram.ui.Components.xz(org.telegram.ui.ActionBar.m6.q6, null), A1, length + A1, 33);
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
                h4Var.b.l(org.telegram.messenger.id.M0(2131746780, null), false);
                org.telegram.ui.ActionBar.m5 m5Var = h4Var.c;
                int i12 = org.telegram.ui.ActionBar.m6.y6;
                m5Var.setTag(Integer.valueOf(i12));
                if (h4Var.K) {
                    i12 = org.telegram.ui.ActionBar.m6.ch;
                }
                org.telegram.ui.ActionBar.t6.X(m5Var, i12, h4Var.M);
                m5Var.setEmojiColor(m5Var.getTextColor());
                m5Var.l(org.telegram.messenger.id.M0(2131746778, null), false);
                h4Var.c(z40Var.X != null, false);
                return;
            }
            if (i7 == this.D) {
                h4Var.s = true;
                h4Var.f = "miniapps";
                org.telegram.ui.Components.k9 k9Var = h4Var.a;
                h4Var.getContext();
                k9Var.setImageDrawable(org.telegram.ui.Cells.h4.a(false));
                h4Var.b.l(org.telegram.messenger.id.M0(2131746806, null), false);
                org.telegram.ui.ActionBar.m5 m5Var2 = h4Var.c;
                int i13 = org.telegram.ui.ActionBar.m6.y6;
                m5Var2.setTag(Integer.valueOf(i13));
                if (h4Var.K) {
                    i13 = org.telegram.ui.ActionBar.m6.ch;
                }
                org.telegram.ui.ActionBar.t6.X(m5Var2, i13, h4Var.M);
                m5Var2.setEmojiColor(m5Var2.getTextColor());
                m5Var2.l(org.telegram.messenger.id.M0(2131746805, null), false);
                h4Var.c(z40Var.Y != null, false);
                return;
            }
            tLObject = (TLObject) arrayList.get(i7 - this.E);
            charSequence = null;
        }
        h4Var.d(tLObject, charSequence3, charSequence);
        long j3 = tLObject instanceof TLRPC.User ? ((TLRPC.User) tLObject).id : tLObject instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject).id : 0L;
        if (j3 != 0) {
            a0.h hVar = z40Var.J;
            if (hVar == null || hVar.h(j3) < 0) {
                h4Var.c(z40Var.Z.h(j3) >= 0, false);
                h4Var.setCheckBoxEnabled(true);
            } else {
                h4Var.c(true, false);
                h4Var.setCheckBoxEnabled(false);
            }
        }
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View x3Var;
        Context context = this.c;
        if (i7 == 0) {
            x3Var = new org.telegram.ui.Cells.x3(context, null);
        } else if (i7 == 1) {
            x3Var = new org.telegram.ui.Cells.h4(context, 1, 0, false);
        } else if (i7 != 3) {
            x3Var = new org.telegram.ui.Cells.m8(context);
        } else {
            org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(context, null, 0, null, 1);
            p50Var.setLayoutParams(new v4.o0(-1, -1));
            p50Var.e.setVisibility(8);
            p50Var.d.setText(org.telegram.messenger.id.M0(2131748223, null));
            p50Var.setAnimateLayoutChange(true);
            x3Var = p50Var;
        }
        return new org.telegram.ui.Components.xi0(x3Var);
    }
}
