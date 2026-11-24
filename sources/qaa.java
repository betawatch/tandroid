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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qaa extends n39 {
    public int H;
    public paa I;
    public int K;
    public final /* synthetic */ taa L;
    public final Context c;
    public final oaa e;
    public naa f;
    public naa h;
    public String n;
    public int r;
    public int s;
    public int w;
    public ArrayList d = new ArrayList();
    public int x = -1;
    public int y = -1;
    public int E = -1;
    public int F = -1;
    public int G = -1;
    public boolean J = false;

    public qaa(taa taaVar, Context context) {
        this.L = taaVar;
        this.c = context;
        oaa oaaVar = new oaa(false);
        this.e = oaaVar;
        oaaVar.a = new ln8((Object) this, (byte) 14);
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        return (i == 1 || i == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            naa naaVar = this.h;
            if (naaVar != null) {
                gl.r(naaVar);
                this.h = null;
            }
            this.d.clear();
            this.e.f(null, null);
            this.e.g(null, true, true, true, true, 0L, false, 0, 0);
            f();
            this.L.D0(true);
            byte b = 0;
            if (TextUtils.isEmpty(str)) {
                this.L.H0();
                this.r = -1;
                this.J = false;
            } else {
                this.J = true;
                int i = this.r + 1;
                this.r = i;
                this.L.L1.e(true, true);
                co3 co3Var = Utilities.g;
                naa naaVar2 = new naa(this, str, i, b);
                this.f = naaVar2;
                co3Var.d(naaVar2, 300L);
            }
            this.L.D0(false);
        }
    }

    @Override // w39
    public final int b() {
        this.H = 0;
        this.x = -1;
        this.y = -1;
        this.F = -1;
        this.G = -1;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        int i = this.H;
        if (!isEmpty) {
            int i2 = i + 1;
            this.H = i2;
            this.E = i;
            int size = this.e.d.size() + this.d.size() + i2;
            this.H = size;
            if (size == 1) {
                this.E = -1;
                this.H = 0;
                this.K = 0;
                return 0;
            }
            int i3 = size + 1;
            this.H = i3;
            this.G = size;
            this.K = i3;
            return i3;
        }
        this.E = i;
        this.H = i + 2;
        this.x = i + 1;
        taa taaVar = this.L;
        if (taaVar.z2.size() > 0) {
            int i4 = this.H;
            int i5 = i4 + 1;
            this.H = i5;
            this.y = i4;
            this.F = i5;
            this.H = taaVar.z2.size() + i5;
        }
        int i6 = this.H;
        int i7 = i6 + 1;
        this.H = i7;
        this.G = i6;
        this.K = i7;
        return i7;
    }

    @Override // w39
    public final int d(int i) {
        if (i == this.G) {
            return 4;
        }
        if (i == this.E) {
            return 1;
        }
        if (i == this.x) {
            return 2;
        }
        if (i == this.y) {
            return 3;
        }
        return TextUtils.isEmpty(this.n) ? 0 : 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.text.SpannableStringBuilder] */
    @Override // w39
    public final void t(s49 s49Var, int i) {
        long j;
        String str;
        String str2;
        long j2;
        int y1;
        TLObject tLObject;
        CharSequence charSequence;
        TLRPC.TL_encryptedChat tL_encryptedChat;
        long j3;
        int y12;
        taa taaVar = this.L;
        vf6 vf6Var = taaVar.P1;
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 != 0 && i2 != 5) {
            if (i2 == 2) {
                ((o39) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m = null;
        oaa oaaVar = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i3 = i - 1;
            int size = this.d.size();
            ArrayList arrayList = this.d;
            if (i3 < size) {
                iaa iaaVar = (iaa) arrayList.get(i3);
                j2 = iaaVar.a.id;
                str2 = iaaVar.d;
            } else {
                i3 -= arrayList.size();
                tLObject2 = (TLObject) oaaVar.d.get(i3);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j = user.id;
                    str = qu2.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j = -chat.id;
                    str = chat.title;
                }
                String str3 = oaaVar.c;
                if (TextUtils.isEmpty(str3) || str == null || (y1 = gl.y1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new cm4(bkb.p6, taaVar.J0), y1, str3.length() + y1, 33);
                    str2 = spannableStringBuilder;
                }
                j2 = j;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof rr8) {
                rr8 rr8Var = (rr8) view;
                rr8Var.z(tLObject3, null, str2, null, false, false);
                rr8Var.N = i3 < b() + (-2);
                return;
            } else {
                String str4 = str2;
                if (view instanceof waa) {
                    ((waa) view).c(j2, vf6Var.h(j2) >= 0, str4);
                    return;
                }
                return;
            }
        }
        int i4 = this.F;
        if (i4 < 0 || i < i4) {
            tLObject = null;
            charSequence = null;
            tL_encryptedChat = null;
            j3 = 0;
        } else {
            TLObject tLObject4 = ((al3) taaVar.z2.get(i - i4)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j3 = user2.id;
                m = qu2.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j3 = -chat2.id;
                m = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User V1 = na7.q1(taaVar.a).V1(Long.valueOf(tL_encryptedChat2.user_id));
                    if (V1 != null) {
                        j3 = V1.id;
                        m = qu2.m(0, V1.first_name, V1.last_name);
                    }
                }
                j3 = 0;
            }
            String str5 = oaaVar.c;
            if (TextUtils.isEmpty(str5) || m == null || (y12 = gl.y1(m.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m);
                spannableStringBuilder2.setSpan(new cm4(bkb.p6, taaVar.J0), y12, str5.length() + y12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof rr8) {
            rr8 rr8Var2 = (rr8) view;
            rr8Var2.z(tLObject, tL_encryptedChat, charSequence, null, false, false);
            rr8Var2.N = i < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof waa) {
                ((waa) view).c(j3, vf6Var.h(j3) >= 0, charSequence2);
            }
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        taa taaVar = this.L;
        Context context = this.c;
        if (i != 0) {
            if (i == 2) {
                rkb rkbVar = new rkb(context, taaVar.J0, (byte) 11);
                rkbVar.setItemAnimator(null);
                rkbVar.setLayoutAnimation(null);
                zr zrVar = new zr((byte) 17);
                zrVar.i1(0);
                rkbVar.setLayoutManager(zrVar);
                paa paaVar = new paa(this, context, taaVar.a, taaVar.J0);
                this.I = paaVar;
                rkbVar.setAdapter(paaVar);
                rkbVar.setOnItemClickListener(new f09(this, (byte) 8));
                view2 = rkbVar;
            } else if (i != 3) {
                byte b = 4;
                if (i == 4) {
                    view2 = new si9(b, context, this);
                } else if (i != 5) {
                    View view3 = new View(context);
                    view3.setLayoutParams(new e49(-1, gl.L((!taaVar.c2 || taaVar.j2[1] == null) ? 56.0f : 109.0f)));
                    view = view3;
                } else {
                    View waaVar = new waa(0, taaVar.J0, context);
                    waaVar.setLayoutParams(new e49(-1, gl.L(100.0f)));
                    view = waaVar;
                }
            } else {
                l35 l35Var = new l35(context, taaVar.J0);
                l35Var.setTextColor(bkb.e7);
                zkb.h(bkb.d7, taaVar.J0, l35Var);
                l35Var.setText(k96.M0(2131746177, null));
                view = l35Var;
            }
            view = view2;
        } else {
            rr8 rr8Var = new rr8(context, taaVar.J0);
            rr8Var.F0 = true;
            rr8Var.m0 = true;
            view = rr8Var;
        }
        return new y29(view);
    }
}
