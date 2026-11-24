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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qca extends q59 {
    public int H;
    public pca I;
    public int K;
    public final /* synthetic */ tca L;
    public final Context c;
    public final oca e;
    public nca f;
    public nca h;
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

    public qca(tca tcaVar, Context context) {
        this.L = tcaVar;
        this.c = context;
        oca ocaVar = new oca(false);
        this.e = ocaVar;
        ocaVar.a = new cf9((Object) this, (byte) 7);
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        return (i == 1 || i == 4) ? false : true;
    }

    public final void E(String str) {
        if (str == null || !str.equals(this.n)) {
            this.n = str;
            if (this.f != null) {
                Utilities.g.a(this.f);
                this.f = null;
            }
            nca ncaVar = this.h;
            if (ncaVar != null) {
                gm.r(ncaVar);
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
                mp3 mp3Var = Utilities.g;
                nca ncaVar2 = new nca(this, str, i, b);
                this.f = ncaVar2;
                mp3Var.d(ncaVar2, 300L);
            }
            this.L.D0(false);
        }
    }

    @Override // y59
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
        tca tcaVar = this.L;
        if (tcaVar.z2.size() > 0) {
            int i4 = this.H;
            int i5 = i4 + 1;
            this.H = i5;
            this.y = i4;
            this.F = i5;
            this.H = tcaVar.z2.size() + i5;
        }
        int i6 = this.H;
        int i7 = i6 + 1;
        this.H = i7;
        this.G = i6;
        this.K = i7;
        return i7;
    }

    @Override // y59
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
    @Override // y59
    public final void t(u69 u69Var, int i) {
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
        tca tcaVar = this.L;
        vh6 vh6Var = tcaVar.P1;
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 != 0 && i2 != 5) {
            if (i2 == 2) {
                ((r59) view).getAdapter().f();
                return;
            }
            return;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n);
        TLObject tLObject2 = null;
        String m = null;
        oca ocaVar = this.e;
        TLRPC.TL_encryptedChat tL_encryptedChat2 = null;
        if (!isEmpty) {
            int i3 = i - 1;
            int size = this.d.size();
            ArrayList arrayList = this.d;
            if (i3 < size) {
                ica icaVar = (ica) arrayList.get(i3);
                j2 = icaVar.a.id;
                str2 = icaVar.d;
            } else {
                i3 -= arrayList.size();
                tLObject2 = (TLObject) ocaVar.d.get(i3);
                if (tLObject2 instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject2;
                    j = user.id;
                    str = bw2.m(0, user.first_name, user.last_name);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                    j = -chat.id;
                    str = chat.title;
                }
                String str3 = ocaVar.c;
                if (TextUtils.isEmpty(str3) || str == null || (y1 = gm.y1(str.toString(), str3)) == -1) {
                    str2 = str;
                } else {
                    ?? spannableStringBuilder = new SpannableStringBuilder(str);
                    spannableStringBuilder.setSpan(new do4(cmb.p6, tcaVar.J0), y1, str3.length() + y1, 33);
                    str2 = spannableStringBuilder;
                }
                j2 = j;
            }
            TLObject tLObject3 = tLObject2;
            if (view instanceof ut8) {
                ut8 ut8Var = (ut8) view;
                ut8Var.x(tLObject3, null, str2, null, false, false);
                ut8Var.N = i3 < b() + (-2);
                return;
            } else {
                String str4 = str2;
                if (view instanceof wca) {
                    ((wca) view).c(j2, vh6Var.h(j2) >= 0, str4);
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
            TLObject tLObject4 = ((lm3) tcaVar.z2.get(i - i4)).a;
            if (tLObject4 instanceof TLRPC.User) {
                TLRPC.User user2 = (TLRPC.User) tLObject4;
                j3 = user2.id;
                m = bw2.m(0, user2.first_name, user2.last_name);
            } else if (tLObject4 instanceof TLRPC.Chat) {
                TLRPC.Chat chat2 = (TLRPC.Chat) tLObject4;
                j3 = -chat2.id;
                m = chat2.title;
            } else {
                if (tLObject4 instanceof TLRPC.TL_encryptedChat) {
                    tL_encryptedChat2 = (TLRPC.TL_encryptedChat) tLObject4;
                    TLRPC.User W1 = oc7.r1(tcaVar.a).W1(Long.valueOf(tL_encryptedChat2.user_id));
                    if (W1 != null) {
                        j3 = W1.id;
                        m = bw2.m(0, W1.first_name, W1.last_name);
                    }
                }
                j3 = 0;
            }
            String str5 = ocaVar.c;
            if (TextUtils.isEmpty(str5) || m == null || (y12 = gm.y1(m.toString(), str5)) == -1) {
                tLObject = tLObject4;
                charSequence = m;
            } else {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(m);
                spannableStringBuilder2.setSpan(new do4(cmb.p6, tcaVar.J0), y12, str5.length() + y12, 33);
                tLObject = tLObject4;
                charSequence = spannableStringBuilder2;
            }
            tL_encryptedChat = tL_encryptedChat2;
        }
        if (view instanceof ut8) {
            ut8 ut8Var2 = (ut8) view;
            ut8Var2.x(tLObject, tL_encryptedChat, charSequence, null, false, false);
            ut8Var2.N = i < b() + (-2);
        } else {
            CharSequence charSequence2 = charSequence;
            if (view instanceof wca) {
                ((wca) view).c(j3, vh6Var.h(j3) >= 0, charSequence2);
            }
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        tca tcaVar = this.L;
        Context context = this.c;
        if (i == 0) {
            ut8 ut8Var = new ut8(context, tcaVar.J0);
            ut8Var.F0 = true;
            ut8Var.m0 = true;
            view = ut8Var;
        } else if (i == 2) {
            smb smbVar = new smb(context, tcaVar.J0, (byte) 11);
            smbVar.setItemAnimator(null);
            smbVar.setLayoutAnimation(null);
            zs zsVar = new zs((byte) 17);
            zsVar.i1(0);
            smbVar.setLayoutManager(zsVar);
            pca pcaVar = new pca(this, context, tcaVar.a, tcaVar.J0);
            this.I = pcaVar;
            smbVar.setAdapter(pcaVar);
            smbVar.setOnItemClickListener(new s19(this, (byte) 9));
            view = smbVar;
        } else if (i != 3) {
            byte b = 5;
            if (i == 4) {
                view = new xd9(b, context, this);
            } else if (i != 5) {
                View view2 = new View(context);
                view2.setLayoutParams(new g69(-1, gm.L((!tcaVar.c2 || tcaVar.j2[1] == null) ? 56.0f : 109.0f)));
                view = view2;
            } else {
                View wcaVar = new wca(0, tcaVar.J0, context);
                wcaVar.setLayoutParams(new g69(-1, gm.L(100.0f)));
                view = wcaVar;
            }
        } else {
            l55 l55Var = new l55(context, tcaVar.J0);
            l55Var.setTextColor(cmb.e7);
            anb.h(cmb.d7, tcaVar.J0, l55Var);
            l55Var.setText(jb6.M0(2131746103, null));
            view = l55Var;
        }
        return new b59(view);
    }
}
