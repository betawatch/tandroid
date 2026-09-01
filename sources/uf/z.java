package uf;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.u2;
import org.telegram.messenger.y3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.oa;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.c81;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.ju0;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.vn0;
import org.telegram.ui.Components.xn0;
import org.telegram.ui.ay;
import org.telegram.ui.bu0;
import org.telegram.ui.dt;
import org.telegram.ui.k10;
import org.telegram.ui.kb1;
import org.telegram.ui.py;
import org.telegram.ui.tv;
import org.telegram.ui.yh;
import org.telegram.ui.yx;
import qh.d4;
import qh.d6;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class z extends sl0 {
    public int A0;
    public v B0;
    public int C0;
    public boolean D0;
    public boolean E0;
    public String J;
    public boolean K;
    public int M;
    public String O;
    public int P;
    public int Q;
    public ay R;
    public final int S;
    public boolean T;
    public boolean U;
    public String W;
    public int X;
    public String Y;
    public int Z;
    public int a0;
    public int b0;
    public int c0;
    public boolean d;
    public int d0;
    public final Context e;
    public final int e0;
    public o f;
    public final f2.l f0;
    public final s g0;
    public o h;
    public kb1 h0;
    public final long i0;
    public long k0;
    public View l0;
    public d6 m0;
    public ArrayList n0;
    public final py o0;
    public final int p0;
    public ArrayList q0;
    public bu0 r;
    public final ArrayList r0;
    public final ArrayList s0;
    public String t0;
    public a0.h u0;
    public int v;
    public final ArrayList v0;
    public int w;
    public boolean w0;
    public k10 x0;
    public String y;
    public int y0;
    public int z0;
    public w c = w.d;
    public int n = -1;
    public ArrayList s = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final ArrayList B = new ArrayList();
    public final ArrayList C = new ArrayList();
    public ArrayList D = new ArrayList();
    public final ArrayList E = new ArrayList();
    public final ArrayList F = new ArrayList();
    public final ArrayList G = new ArrayList();
    public final ArrayList H = new ArrayList();
    public final HashSet I = new HashSet();
    public int L = 0;
    public int N = 0;
    public int V = -1;
    public boolean j0 = false;

    public z(Context context, py pyVar, int i10, int i11, f2.l lVar, boolean z4) {
        int i12 = UserConfig.selectedAccount;
        this.p0 = i12;
        this.q0 = new ArrayList();
        this.r0 = new ArrayList();
        this.s0 = new ArrayList();
        this.t0 = null;
        this.u0 = new a0.h();
        this.v0 = new ArrayList();
        this.C0 = -1;
        this.D0 = true;
        this.E0 = true;
        this.f0 = lVar;
        this.o0 = pyVar;
        xn0 xn0Var = (xn0) this;
        s sVar = new s(xn0Var);
        this.g0 = sVar;
        sVar.a = new ai(xn0Var, 17);
        sVar.p = z4;
        this.e = context;
        this.S = i10;
        this.e0 = i11;
        this.i0 = UserConfig.getInstance(i12).getClientUserId();
        if (i11 != 15) {
            MessagesStorage.getInstance(i12).getStorageQueue().postRunnable(new j3.v(i12, i11, new r(this), 14));
        }
        MediaDataController.getInstance(i12).loadHints(true);
    }

    public static boolean Y(String str, String str2) {
        if (str2 != null && str != null) {
            String[] split = str.toLowerCase().split(" ");
            for (int i10 = 0; i10 < split.length; i10++) {
                String str3 = split[i10];
                if (str3 != null && (str3.startsWith(str2) || str2.startsWith(split[i10]))) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f;
        return (i10 == 1 || i10 == 4 || i10 == 10) ? false : true;
    }

    public final void E() {
        StringBuilder sb;
        boolean z4 = this.K;
        ArrayList arrayList = this.r0;
        ArrayList arrayList2 = this.s0;
        if (z4) {
            sb = null;
            while (arrayList2.size() > 0) {
                y yVar = (y) arrayList2.remove(0);
                this.q0.remove(yVar);
                arrayList.remove(yVar);
                this.u0.l(yVar.c);
                if (sb == null) {
                    sb = new StringBuilder("did IN (");
                    sb.append(yVar.c);
                } else {
                    sb.append(", ");
                    sb.append(yVar.c);
                }
            }
            if (sb == null) {
                sb = new StringBuilder("1");
            } else {
                sb.append(")");
            }
        } else {
            arrayList2.clear();
            arrayList.clear();
            this.q0.clear();
            this.u0.b();
            sb = new StringBuilder("1");
        }
        String str = this.J;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.p0).getStorageQueue().postRunnable(new d6(26, (xn0) this, sb));
    }

    public final boolean F(Object obj) {
        if (this.e0 != 14) {
            return true;
        }
        boolean z4 = obj instanceof TLRPC.User;
        py pyVar = this.o0;
        if (z4) {
            return ((TLRPC.User) obj).bot ? pyVar.x2 : pyVar.w2;
        }
        if (!(obj instanceof TLRPC.Chat)) {
            return false;
        }
        TLRPC.Chat chat = (TLRPC.Chat) obj;
        return ChatObject.isChannel(chat) ? pyVar.v2 : ChatObject.isMegagroup(chat) ? pyVar.s2 || pyVar.t2 : pyVar.s2 || pyVar.u2;
    }

    public final void G(String str) {
        ay ayVar;
        String str2;
        String str3;
        this.t0 = str;
        ArrayList arrayList = this.s0;
        arrayList.clear();
        if (TextUtils.isEmpty(str)) {
            ArrayList arrayList2 = this.r0;
            arrayList2.clear();
            int size = this.q0.size();
            for (int i10 = 0; i10 < size; i10++) {
                ay ayVar2 = this.R;
                if ((ayVar2 == null || ayVar2.a() != ((y) this.q0.get(i10)).c) && F(((y) this.q0.get(i10)).a)) {
                    arrayList2.add((y) this.q0.get(i10));
                }
            }
            return;
        }
        String lowerCase = str.toLowerCase();
        int size2 = this.q0.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y yVar = (y) this.q0.get(i11);
            if (yVar != null && yVar.a != null && (((ayVar = this.R) == null || ayVar.a() != yVar.c) && F(((y) this.q0.get(i11)).a))) {
                TLObject tLObject = yVar.a;
                if (tLObject instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                    str2 = chat.monoforum ? bg.e.i(chat, this.p0, false) : chat.title;
                    str3 = ((TLRPC.Chat) yVar.a).username;
                } else if (tLObject instanceof TLRPC.User) {
                    str2 = UserObject.getUserName((TLRPC.User) tLObject);
                    str3 = ((TLRPC.User) yVar.a).username;
                } else if (tLObject instanceof TLRPC.ChatInvite) {
                    str2 = ((TLRPC.ChatInvite) tLObject).title;
                    str3 = null;
                } else {
                    str2 = null;
                    str3 = null;
                }
                if ((str2 != null && Y(str2.toLowerCase(), lowerCase)) || (str3 != null && Y(str3.toLowerCase(), lowerCase))) {
                    arrayList.add(yVar);
                }
                if (arrayList.size() >= 5) {
                    return;
                }
            }
        }
    }

    public final SpannableStringBuilder H(w wVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(wVar.c));
        spannableStringBuilder.append((CharSequence) "v");
        spannableStringBuilder.setSpan(new oq(R.drawable.arrows_select, 0), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    public final kb1 I() {
        return this.h0;
    }

    /* JADX WARN: Type inference failed for: r1v16, types: [boolean] */
    public final Object J(int i10) {
        int i11;
        int i12;
        TLRPC.Chat chat;
        int i13;
        ArrayList arrayList = this.x;
        if (!arrayList.isEmpty()) {
            if (i10 > 0 && i10 - 1 < arrayList.size()) {
                return arrayList.get(i13);
            }
            i10 = yh.e(1, i10, arrayList);
        }
        ArrayList arrayList2 = this.G;
        if (!arrayList2.isEmpty()) {
            if (i10 > 0) {
                return arrayList2.get(i10 - 1);
            }
            return null;
        }
        if (P()) {
            ?? M = M();
            ArrayList arrayList3 = this.K ? this.s0 : this.r0;
            if (i10 > M && (i12 = (i10 - 1) - (M == true ? 1 : 0)) < arrayList3.size()) {
                TLObject tLObject = ((y) arrayList3.get(i12)).a;
                boolean z4 = tLObject instanceof TLRPC.User;
                int i14 = this.p0;
                if (!z4) {
                    return (!(tLObject instanceof TLRPC.Chat) || (chat = MessagesController.getInstance(i14).getChat(Long.valueOf(((TLRPC.Chat) tLObject).id))) == null) ? tLObject : chat;
                }
                TLRPC.User user = MessagesController.getInstance(i14).getUser(Long.valueOf(((TLRPC.User) tLObject).id));
                return user != null ? user : tLObject;
            }
            i10 -= K();
        }
        ArrayList arrayList4 = this.C;
        if (!arrayList4.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList4.size()) {
                return arrayList4.get(i10 - 1);
            }
            i10 = yh.e(1, i10, arrayList4);
        }
        ArrayList arrayList5 = this.B;
        if (!arrayList5.isEmpty()) {
            if (i10 > 0 && i10 <= arrayList5.size()) {
                return arrayList5.get(i10 - 1);
            }
            i10 = yh.e(1, i10, arrayList5);
        }
        s sVar = this.g0;
        ArrayList arrayList6 = sVar.e;
        ArrayList arrayList7 = sVar.d;
        ArrayList arrayList8 = sVar.j;
        int size = this.s.size();
        int size2 = arrayList7.size();
        if (size + size2 > 0 && (K() > 0 || !arrayList4.isEmpty() || !arrayList.isEmpty())) {
            if (i10 == 0) {
                return null;
            }
            i10--;
        }
        int size3 = arrayList8.size();
        if (size3 > 3 && this.E0) {
            size3 = 3;
        }
        int size4 = arrayList6.size();
        int i15 = (size4 <= 3 || !this.D0) ? size4 : 3;
        boolean isEmpty = arrayList6.isEmpty();
        int i16 = 0;
        ArrayList arrayList9 = this.H;
        int size5 = (isEmpty && arrayList9.isEmpty()) ? 0 : arrayList9.size() + i15 + 1;
        if (i10 >= 0 && i10 < size) {
            return this.s.get(i10);
        }
        int i17 = i10 - size;
        if (i17 >= 0 && i17 < size2) {
            return arrayList7.get(i17);
        }
        int i18 = i17 - size2;
        if (i18 >= 0 && i18 < size3) {
            return arrayList8.get(i18);
        }
        int i19 = i18 - size3;
        if (i19 <= 0 || i19 >= size5) {
            i11 = i19 - size5;
        } else {
            int i20 = i19 - 1;
            if (i20 >= 0 && i20 < arrayList9.size()) {
                return arrayList9.get(i20);
            }
            i11 = i20 - arrayList9.size();
            if (i11 >= 0 && i11 < arrayList6.size()) {
                return arrayList6.get(i11);
            }
        }
        ArrayList arrayList10 = this.E;
        int size6 = arrayList10.isEmpty() ? 0 : arrayList10.size() + 1;
        if (i11 > 0 && i11 <= arrayList10.size()) {
            return arrayList10.get(i11 - 1);
        }
        if (!this.U && !arrayList10.isEmpty()) {
            i16 = 1;
        }
        int i21 = i11 - (size6 + i16);
        ArrayList arrayList11 = this.F;
        if (!arrayList11.isEmpty()) {
            arrayList11.size();
        }
        if (i21 <= 0 || i21 > arrayList11.size()) {
            return null;
        }
        return arrayList11.get(i21 - 1);
    }

    public final int K() {
        ArrayList arrayList = this.K ? this.s0 : this.r0;
        return (M() ? 1 : 0) + (!arrayList.isEmpty() ? arrayList.size() + 1 : 0);
    }

    public final int L() {
        if (this.A0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = arrayList.isEmpty() ? 0 : arrayList.size() + 1;
        ArrayList arrayList2 = this.G;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
            if (!this.K) {
                return size;
            }
        }
        ArrayList arrayList3 = this.C;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        int size3 = this.g0.d.size();
        int i10 = size + size2 + size3;
        return size2 + size3 > 0 ? (K() <= 0 && arrayList3.isEmpty() && arrayList.isEmpty()) ? i10 : i10 + 1 : i10;
    }

    public final boolean M() {
        if (this.K || MediaDataController.getInstance(this.p0).hints.isEmpty()) {
            return false;
        }
        return this.e0 != 14 || this.o0.w2;
    }

    public final boolean N() {
        return S() && K() > 0;
    }

    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    public final boolean O(int i10) {
        int i11;
        int i12;
        if (this.K && this.G.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                i10 = yh.e(1, i10, arrayList);
            }
            if (P()) {
                ?? M = M();
                ArrayList arrayList2 = this.K ? this.s0 : this.r0;
                if (i10 <= M || (i10 - 1) - (M == true ? 1 : 0) >= arrayList2.size()) {
                    i10 -= K();
                }
            }
            s sVar = this.g0;
            ArrayList arrayList3 = sVar.e;
            ArrayList arrayList4 = sVar.d;
            int size = this.s.size();
            int size2 = arrayList4.size();
            int size3 = sVar.j.size();
            if (size3 > 3 && this.E0) {
                size3 = 3;
            }
            int size4 = arrayList3.size();
            int i13 = (size4 <= 3 || !this.D0) ? size4 : 3;
            boolean isEmpty = arrayList3.isEmpty();
            ArrayList arrayList5 = this.H;
            int size5 = (isEmpty && arrayList5.isEmpty()) ? 0 : arrayList5.size() + i13 + 1;
            int size6 = this.B.size();
            if (size6 > 0) {
                if (i10 < 0 || i10 >= size6) {
                    i10 -= size6 + 1;
                }
            }
            if (size + size2 > 0 && (K() > 0 || !this.C.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            if ((i10 < 0 || i10 >= size) && (((i11 = i10 - size) < 0 || i11 >= size2) && ((i12 = i11 - size2) <= 0 || i12 >= size3))) {
                int i14 = i12 - size3;
                if (i14 > 0 && i14 < size5) {
                    return true;
                }
                int i15 = i14 - size5;
                ArrayList arrayList6 = this.E;
                int size7 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
                if (i15 <= 0 || i15 >= size7) {
                    ArrayList arrayList7 = this.F;
                    if (!arrayList7.isEmpty()) {
                        arrayList7.size();
                    }
                    if (this.c != w.d || this.d) {
                        arrayList7.isEmpty();
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final boolean P() {
        return this.S != 2 && N();
    }

    public final void Q() {
        if ((this.N == 0 || this.L == 0) && this.d0 == this.a0) {
            ay ayVar = this.R;
            if (ayVar == null || ayVar.a() == 0 || this.U) {
                W(this.d0, this.W);
            } else {
                V(this.d0, this.W);
            }
        }
    }

    public final void R(long j10, TLObject tLObject) {
        y yVar = (y) this.u0.f(j10);
        if (yVar == null) {
            yVar = new y();
            this.u0.k(yVar, j10);
        } else {
            this.q0.remove(yVar);
        }
        this.q0.add(0, yVar);
        yVar.c = j10;
        yVar.a = tLObject;
        yVar.b = (int) (System.currentTimeMillis() / 1000);
        String str = this.J;
        G(str != null ? str.trim() : null);
        l();
        MessagesStorage.getInstance(this.p0).getStorageQueue().postRunnable(new n((xn0) this, j10, 1));
    }

    public final boolean S() {
        int i10 = this.e0;
        return (i10 == 2 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 1 || i10 == 11 || i10 == 15) ? false : true;
    }

    public final void T() {
        int L;
        ArrayList arrayList = this.H;
        if (!arrayList.isEmpty() && (L = L()) < h()) {
            int size = arrayList.size();
            arrayList.clear();
            t(L + 1, size);
            int size2 = this.g0.e.size();
            if (this.D0) {
                size2 = Math.min(3, size2);
            }
            if (size2 <= 0) {
                u(L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(int i10, String str) {
        String str2;
        if (str != null && str.equals(this.J) && (i10 == this.z0 || TextUtils.isEmpty(str))) {
            return;
        }
        this.J = str;
        this.z0 = i10;
        if (this.f != null) {
            Utilities.searchQueue.cancelRunnable(this.f);
            this.f = null;
        }
        o oVar = this.h;
        if (oVar != null) {
            AndroidUtilities.cancelRunOnUIThread(oVar);
            this.h = null;
        }
        bu0 bu0Var = this.r;
        if (bu0Var != null) {
            AndroidUtilities.cancelRunOnUIThread(bu0Var);
            this.r = null;
        }
        if (this.n >= 0) {
            ConnectionsManager.getInstance(this.p0).cancelRequest(this.n, true);
            this.n = -1;
        }
        String trim = str != null ? str.trim() : null;
        G(trim);
        if (!TextUtils.equals(this.O, trim)) {
            this.O = trim;
            this.H.clear();
            if (this.P != 0) {
                ConnectionsManager.getInstance(this.p0).cancelRequest(this.P, true);
                this.P = 0;
            }
            if (trim == null || trim.length() < 4 || (UserConfig.getInstance(this.p0).isPremium() && MessagesController.getInstance(this.p0).isSponsoredDisabled())) {
                this.O = null;
            } else {
                TLRPC.TL_contacts_getSponsoredPeers tL_contacts_getSponsoredPeers = new TLRPC.TL_contacts_getSponsoredPeers();
                this.O = trim;
                tL_contacts_getSponsoredPeers.q = trim;
                this.P = ConnectionsManager.getInstance(this.p0).sendRequest(tL_contacts_getSponsoredPeers, new gf.a((xn0) this, 21));
            }
        }
        if (TextUtils.isEmpty(trim)) {
            this.t0 = null;
            this.g0.s = false;
            this.s.clear();
            this.D.clear();
            this.G.clear();
            this.v = 0;
            this.w = 0;
            this.y = null;
            this.x.clear();
            this.g0.f(null, null);
            int i11 = this.e0;
            if (i11 != 15) {
                s sVar = this.g0;
                boolean z4 = i11 != 11;
                boolean z10 = i11 != 11;
                boolean z11 = i11 == 2 || i11 == 11;
                boolean z12 = i11 == 0;
                ay ayVar = this.R;
                sVar.h(null, true, true, z4, z10, z11, 0L, z12, 0, 0, ayVar != null ? ayVar.a() : 0L, null);
            }
            this.K = false;
            this.a0 = 0;
            this.A0 = 0;
            this.D0 = true;
            this.E0 = true;
            ay ayVar2 = this.R;
            if (ayVar2 != null) {
                ayVar2.d(false, true);
            }
            if (this.e0 != 15) {
                X(null);
                W(0, null);
                V(0, null);
            }
            l();
            this.v0.clear();
            this.w0 = false;
            k10 k10Var = this.x0;
            if (k10Var != null) {
                ((tv) k10Var).h(false, null, this.v0, false);
                return;
            }
            return;
        }
        this.g0.f(this.s, this.s0);
        this.v = 0;
        this.w = 0;
        this.y = null;
        this.x.clear();
        if (this.S != 2 && trim.startsWith("#") && trim.length() == 1) {
            this.T = true;
            s sVar2 = this.g0;
            if (sVar2.s) {
                this.F.clear();
                this.G.clear();
                ArrayList arrayList = this.g0.q;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    this.G.add(((i1) arrayList.get(i12)).a);
                }
                this.D0 = true;
                this.E0 = true;
                this.A0 = 0;
                l();
                ay ayVar3 = this.R;
                if (ayVar3 != null) {
                    ayVar3.d(false, false);
                }
            } else {
                MessagesStorage.getInstance(sVar2.m).getStorageQueue().postRunnable(new g1(sVar2, 1));
            }
        } else {
            this.G.clear();
        }
        int i13 = this.a0 + 1;
        this.a0 = i13;
        this.A0 = 3;
        this.D0 = true;
        this.E0 = true;
        l();
        ay ayVar4 = this.R;
        if (ayVar4 != null) {
            ayVar4.d(true, false);
        }
        if (trim != null) {
            String trim2 = trim.trim();
            if (trim2.length() > 1 && (trim2.charAt(0) == '#' || trim2.charAt(0) == '$')) {
                int indexOf = trim2.indexOf(64);
                String substring = trim2.substring(1);
                if (indexOf >= 0) {
                    trim2.substring(indexOf + 1);
                }
                str2 = substring;
                DispatchQueue dispatchQueue = Utilities.searchQueue;
                xn0 xn0Var = (xn0) this;
                o oVar2 = new o(xn0Var, trim, i13, str, 2);
                this.f = oVar2;
                dispatchQueue.postRunnable(oVar2, 300L);
                if (str2 == null) {
                    this.A0++;
                    bu0 bu0Var2 = new bu0(xn0Var, i13, str2, 17);
                    this.r = bu0Var2;
                    AndroidUtilities.runOnUIThread(bu0Var2, 300L);
                    return;
                }
                return;
            }
        }
        str2 = null;
        DispatchQueue dispatchQueue2 = Utilities.searchQueue;
        xn0 xn0Var2 = (xn0) this;
        o oVar22 = new o(xn0Var2, trim, i13, str, 2);
        this.f = oVar22;
        dispatchQueue2.postRunnable(oVar22, 300L);
        if (str2 == null) {
        }
    }

    public final void V(int i10, String str) {
        ay ayVar = this.R;
        if (ayVar == null || ayVar.a() == 0 || this.S == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.W) && TextUtils.isEmpty(str)) {
            return;
        }
        int i11 = this.N;
        int i12 = this.p0;
        if (i11 != 0) {
            ConnectionsManager.getInstance(i12).cancelRequest(this.N, true);
            this.N = 0;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.E;
        if (isEmpty) {
            this.t0 = null;
            this.F.clear();
            arrayList.clear();
            this.Q = 0;
            this.W = null;
            this.K = false;
            l();
            return;
        }
        if (this.e0 == 15) {
            return;
        }
        long a2 = this.R.a();
        TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
        tL_messages_search.limit = 20;
        tL_messages_search.q = str;
        tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
        tL_messages_search.peer = MessagesController.getInstance(i12).getInputPeer(a2);
        if (str.equals(this.W) && !arrayList.isEmpty()) {
            tL_messages_search.add_offset = arrayList.size();
        }
        this.W = str;
        int i13 = 1 + this.Q;
        this.Q = i13;
        this.N = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_search, new u2(this, str, i13, i10, tL_messages_search, 1), 2);
    }

    public final void W(int i10, String str) {
        if (this.S != 0 && (!TextUtils.isEmpty(this.W) || !TextUtils.isEmpty(str))) {
            int i11 = this.L;
            int i12 = this.p0;
            if (i11 != 0) {
                ConnectionsManager.getInstance(i12).cancelRequest(this.L, true);
                this.L = 0;
            }
            boolean isEmpty = TextUtils.isEmpty(str);
            ArrayList arrayList = this.F;
            if (isEmpty || this.R.a() != 0) {
                this.t0 = null;
                arrayList.clear();
                this.E.clear();
                this.M = 0;
                this.W = null;
                this.X = 0;
                this.K = false;
                l();
                return;
            }
            G(str);
            this.g0.f(this.s, this.s0);
            if (this.e0 != 15) {
                TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                int i13 = this.c.a;
                tL_messages_searchGlobal.broadcasts_only = (i13 & 2) != 0;
                tL_messages_searchGlobal.groups_only = (i13 & 4) != 0;
                tL_messages_searchGlobal.users_only = (i13 & 8) != 0;
                tL_messages_searchGlobal.limit = 20;
                tL_messages_searchGlobal.q = str;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.flags |= 1;
                tL_messages_searchGlobal.folder_id = this.z0;
                if (!str.equals(this.W)) {
                    this.d = false;
                }
                if (str.equals(this.W) && this.X == this.c.a && !arrayList.isEmpty() && this.d0 == this.a0) {
                    MessageObject messageObject = (MessageObject) l.d.i(1, arrayList);
                    tL_messages_searchGlobal.offset_id = messageObject.getId();
                    tL_messages_searchGlobal.offset_rate = this.Z;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(i12).getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
                } else {
                    tL_messages_searchGlobal.offset_rate = 0;
                    tL_messages_searchGlobal.offset_id = 0;
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                }
                this.W = str;
                this.X = this.c.a;
                int i14 = this.M + 1;
                this.M = i14;
                this.L = ConnectionsManager.getInstance(i12).sendRequest(tL_messages_searchGlobal, new u2(this, str, i14, i10, tL_messages_searchGlobal, 2), 2);
                return;
            }
            int i15 = this.A0 - 1;
            this.A0 = i15;
            ay ayVar = this.R;
            if (ayVar != null) {
                ayVar.d(i15 > 0, true);
                this.R.c();
            }
        }
    }

    public final void X(String str) {
        ArrayList arrayList = this.C;
        arrayList.clear();
        ay ayVar = this.R;
        if (ayVar == null || ayVar.a() == 0) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.p0).getTopicsController().getTopics(-this.R.a());
            String trim = str.trim();
            for (int i10 = 0; i10 < topics.size(); i10++) {
                if (topics.get(i10) != null && topics.get(i10).title.toLowerCase().contains(trim)) {
                    arrayList.add(topics.get(i10));
                    topics.get(i10).searchQuery = trim;
                }
            }
        }
        l();
    }

    @Override // f2.p0
    public final int h() {
        if (this.A0 == 3) {
            return 0;
        }
        ArrayList arrayList = this.x;
        int size = !arrayList.isEmpty() ? arrayList.size() + 1 : 0;
        ArrayList arrayList2 = this.G;
        if (!arrayList2.isEmpty()) {
            return arrayList2.size() + 1 + size;
        }
        if (P()) {
            size += K();
            if (!this.K) {
                return size;
            }
        }
        ArrayList arrayList3 = this.C;
        if (!arrayList3.isEmpty()) {
            size = size + 1 + arrayList3.size();
        }
        ArrayList arrayList4 = this.B;
        if (!arrayList4.isEmpty()) {
            size += arrayList4.size() + 1;
        }
        int size2 = this.s.size();
        s sVar = this.g0;
        int size3 = sVar.d.size();
        int i10 = size + size2 + size3;
        int size4 = sVar.e.size();
        if (size4 > 3 && this.D0) {
            size4 = 3;
        }
        int size5 = this.H.size() + size4;
        int size6 = sVar.j.size();
        if (size6 > 3 && this.E0) {
            size6 = 3;
        }
        if (size2 + size3 > 0 && (K() > 0 || !arrayList3.isEmpty() || !arrayList.isEmpty())) {
            i10++;
        }
        if (size5 != 0) {
            i10 += size5 + 1;
        }
        if (size6 != 0) {
            i10 += size6;
        }
        ArrayList arrayList5 = this.E;
        int size7 = arrayList5.size();
        if (size7 != 0) {
            i10 += size7 + 1 + (!this.U ? 1 : 0);
        }
        if (!this.U) {
            this.V = i10;
        }
        ArrayList arrayList6 = this.F;
        int size8 = arrayList6.size();
        if ((this.c != w.d || this.d) && arrayList6.isEmpty()) {
            size8 = this.d ? 3 : 1;
        }
        int i11 = (arrayList5.isEmpty() || this.U) ? size8 : 0;
        if (i11 != 0) {
            i10 += i11 + 1 + (!this.T ? 1 : 0);
        }
        if (this.U) {
            this.V = i10;
        }
        this.y0 = i10;
        return i10;
    }

    @Override // f2.p0
    public final long i(int i10) {
        return i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0155, code lost:
    
        if (r14 != 0) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0158, code lost:
    
        if (r14 != r6) goto L148;
     */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11;
        if (this.G.isEmpty()) {
            ArrayList arrayList = this.x;
            if (!arrayList.isEmpty()) {
                if (i10 != 0) {
                    int i12 = i10 - 1;
                    if (i12 < arrayList.size()) {
                        return 9;
                    }
                    i10 = i12 - arrayList.size();
                }
            }
            if (P()) {
                ?? M = M();
                if (i10 < M) {
                    return 6;
                }
                if (i10 != M) {
                    if (i10 >= K()) {
                        i10 -= K();
                    }
                    return 0;
                }
            }
            ArrayList arrayList2 = this.C;
            if (!arrayList2.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList2.size()) {
                        return 3;
                    }
                    i10 = yh.e(1, i10, arrayList2);
                }
            }
            ArrayList arrayList3 = this.B;
            if (!arrayList3.isEmpty()) {
                if (i10 != 0) {
                    if (i10 <= arrayList3.size()) {
                        return 8;
                    }
                    i10 = yh.e(1, i10, arrayList3);
                }
            }
            s sVar = this.g0;
            ArrayList arrayList4 = sVar.e;
            int size = this.s.size();
            int size2 = sVar.d.size();
            if (size + size2 > 0 && (K() > 0 || !arrayList2.isEmpty() || !arrayList.isEmpty())) {
                if (i10 != 0) {
                    i10--;
                }
            }
            int size3 = sVar.j.size();
            if (size3 > 3 && this.E0) {
                size3 = 3;
            }
            int size4 = arrayList4.size();
            int i13 = (size4 <= 3 || !this.D0) ? size4 : 3;
            ArrayList arrayList5 = this.H;
            int size5 = (arrayList5.isEmpty() && arrayList4.isEmpty()) ? 0 : arrayList5.size() + i13 + 1;
            ArrayList arrayList6 = this.F;
            int size6 = arrayList6.isEmpty() ? 0 : arrayList6.size() + 1;
            w wVar = this.c;
            w wVar2 = w.d;
            if ((wVar != wVar2 || this.d) && arrayList6.isEmpty()) {
                size6 = this.d ? 4 : 2;
            }
            ArrayList arrayList7 = this.E;
            if (!arrayList7.isEmpty() && !this.U) {
                size6 = 0;
            }
            int size7 = arrayList7.isEmpty() ? 0 : arrayList7.size() + 1;
            if ((i10 < 0 || i10 >= size) && ((i11 = i10 - size) < 0 || i11 >= size2)) {
                int i14 = i11 - size2;
                if (i14 < 0 || i14 >= size3) {
                    int i15 = i14 - size3;
                    if (i15 < 0 || i15 >= size5) {
                        int i16 = i15 - size5;
                        if (size7 > 0) {
                            if (i16 >= 0) {
                                if (this.U) {
                                }
                            }
                            i16 -= size7 + (!this.U ? 1 : 0);
                        }
                        if (i16 >= 0 && i16 < size6) {
                            if (i16 != 0) {
                                if (!this.d || !arrayList6.isEmpty()) {
                                    return (this.c == wVar2 || !arrayList6.isEmpty()) ? 2 : 10;
                                }
                            }
                        }
                        return 4;
                    }
                    if (i15 == 0) {
                    }
                } else {
                    Object J = J(i14);
                    if (J instanceof String) {
                        if (!"section".equals((String) J)) {
                            return 7;
                        }
                    }
                }
            }
            return 0;
        }
        if (i10 != 0) {
            return 5;
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:238:0x0570, code lost:
    
        if (r5 != false) goto L269;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x06a4  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0775  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x074b  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0327  */
    /* JADX WARN: Type inference failed for: r10v39, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [android.text.SpannableStringBuilder] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14, types: [org.telegram.tgnet.TLRPC$Chat] */
    /* JADX WARN: Type inference failed for: r7v38 */
    @Override // f2.p0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(f2.m1 m1Var, int i10) {
        ArrayList arrayList;
        Object obj;
        TLRPC.EncryptedChat encryptedChat;
        TLRPC.User user;
        ?? r72;
        ArrayList<TLRPC.TL_username> arrayList2;
        String str;
        TLRPC.EncryptedChat encryptedChat2;
        boolean z4;
        boolean z10;
        CharSequence charSequence;
        ?? r52;
        CharSequence charSequence2;
        CharSequence charSequence3;
        CharSequence charSequence4;
        String str2;
        CharSequence charSequence5;
        boolean z11;
        String str3;
        int i11;
        String str4;
        String str5;
        int indexOfIgnoreCase;
        TLRPC.Chat chat;
        String publicUsername;
        TLRPC.Chat chat2;
        int i12;
        int i13;
        String str6;
        SpannableStringBuilder spannableStringBuilder;
        Runnable runnable;
        boolean z12;
        final int i14;
        char c3;
        String i15;
        int i16 = i10;
        int i17 = m1Var.f;
        View view = m1Var.a;
        ArrayList arrayList3 = this.E;
        ArrayList arrayList4 = this.G;
        ArrayList arrayList5 = this.H;
        ArrayList arrayList6 = this.x;
        ArrayList arrayList7 = this.C;
        s sVar = this.g0;
        int i18 = this.p0;
        final int i19 = 1;
        switch (i17) {
            case 0:
                h6 h6Var = (h6) view;
                h6Var.setBackgroundColor(k6.w0(null, k6.d6, false));
                long dialogId = h6Var.getDialogId();
                boolean O = O(i16);
                Object J = J(i16);
                boolean z13 = J instanceof TLRPC.TL_sponsoredPeer;
                if (z13) {
                    TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) J;
                    HashSet hashSet = this.I;
                    Iterator it = hashSet.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            hashSet.add(tL_sponsoredPeer.random_id);
                            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
                            tL_messages_viewSponsoredMessage.random_id = tL_sponsoredPeer.random_id;
                            ConnectionsManager.getInstance(i18).sendRequest(tL_messages_viewSponsoredMessage, null);
                        } else if (Arrays.equals((byte[]) it.next(), tL_sponsoredPeer.random_id)) {
                        }
                    }
                    long peerDialogId = DialogObject.getPeerDialogId(tL_sponsoredPeer.peer);
                    if (peerDialogId >= 0) {
                        user = MessagesController.getInstance(i18).getUser(Long.valueOf(peerDialogId));
                        if (user != null) {
                            ArrayList<TLRPC.TL_username> arrayList8 = user.usernames;
                            publicUsername = DialogObject.getPublicUsername(user, this.Y);
                            arrayList2 = arrayList8;
                            chat2 = null;
                            String str7 = publicUsername;
                            arrayList = arrayList5;
                            str = str7;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = null;
                            arrayList2 = null;
                            publicUsername = null;
                            chat2 = chat;
                            String str72 = publicUsername;
                            arrayList = arrayList5;
                            str = str72;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    } else {
                        TLRPC.Chat chat3 = MessagesController.getInstance(i18).getChat(Long.valueOf(-peerDialogId));
                        if (chat3 != null) {
                            ArrayList<TLRPC.TL_username> arrayList9 = chat3.usernames;
                            publicUsername = DialogObject.getPublicUsername(chat3, this.Y);
                            arrayList2 = arrayList9;
                            chat2 = chat3;
                            user = null;
                            String str722 = publicUsername;
                            arrayList = arrayList5;
                            str = str722;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        } else {
                            chat = chat3;
                            user = null;
                            arrayList2 = null;
                            publicUsername = null;
                            chat2 = chat;
                            String str7222 = publicUsername;
                            arrayList = arrayList5;
                            str = str7222;
                            obj = J;
                            encryptedChat = null;
                            r72 = chat2;
                        }
                    }
                } else if (J instanceof TLRPC.User) {
                    user = (TLRPC.User) J;
                    ArrayList<TLRPC.TL_username> arrayList10 = user.usernames;
                    obj = J;
                    arrayList = arrayList5;
                    encryptedChat = null;
                    str = DialogObject.getPublicUsername(user, this.Y);
                    arrayList2 = arrayList10;
                    r72 = 0;
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat4 = (TLRPC.Chat) J;
                    arrayList = arrayList5;
                    TLRPC.Chat chat5 = MessagesController.getInstance(i18).getChat(Long.valueOf(chat4.id));
                    if (chat5 == null) {
                        chat5 = chat4;
                    }
                    ArrayList<TLRPC.TL_username> arrayList11 = chat5.usernames;
                    obj = J;
                    str = DialogObject.getPublicUsername(chat5, this.Y);
                    encryptedChat = null;
                    arrayList2 = arrayList11;
                    r72 = chat5;
                    user = null;
                } else {
                    arrayList = arrayList5;
                    if (J instanceof TLRPC.EncryptedChat) {
                        TLRPC.EncryptedChat encryptedChat3 = MessagesController.getInstance(i18).getEncryptedChat(Integer.valueOf(((TLRPC.EncryptedChat) J).id));
                        obj = J;
                        encryptedChat = encryptedChat3;
                        user = MessagesController.getInstance(i18).getUser(Long.valueOf(encryptedChat3.user_id));
                    } else {
                        obj = J;
                        encryptedChat = null;
                        user = null;
                    }
                    r72 = 0;
                    arrayList2 = null;
                    str = null;
                }
                if (arrayList6.isEmpty()) {
                    encryptedChat2 = encryptedChat;
                } else {
                    encryptedChat2 = encryptedChat;
                    i16 = yh.e(1, i16, arrayList6);
                }
                if (P()) {
                    if (i16 < K()) {
                        h6Var.J = i16 != K() + (-1);
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    i16 -= K();
                } else {
                    z4 = false;
                }
                if (arrayList7.isEmpty()) {
                    z10 = z13;
                } else {
                    z10 = z13;
                    i16 = yh.e(1, i16, arrayList7);
                }
                ArrayList arrayList12 = sVar.e;
                ArrayList arrayList13 = sVar.j;
                int i20 = i16;
                int size = this.s.size();
                int size2 = sVar.d.size();
                int i21 = (size + size2 <= 0 || (K() <= 0 && arrayList7.isEmpty() && arrayList6.isEmpty())) ? i20 : i20 - 1;
                int size3 = arrayList13.size();
                if (size3 > 3 && this.E0) {
                    size3 = 3;
                }
                int i22 = (size3 <= 0 || !(arrayList13.get(size3 + (-1)) instanceof String)) ? size3 : size3 - 2;
                int size4 = arrayList12.size();
                if (size4 > 3 && this.D0) {
                    size4 = 3;
                }
                int size5 = (arrayList12.isEmpty() && arrayList.isEmpty()) ? 0 : arrayList.size() + size4 + 1;
                if (!z4) {
                    h6Var.J = (i21 == (h() - K()) + (-1) || i21 == ((size + i22) + size2) + (-1) || i21 == (((size + size5) + size3) + size2) + (-1)) ? false : true;
                }
                if (i21 < 0 || i21 >= this.s.size() || user != null) {
                    charSequence = null;
                } else {
                    CharSequence charSequence6 = (CharSequence) this.D.get(i21);
                    String publicUsername2 = UserObject.getPublicUsername(user);
                    if (charSequence6 != null && user != null && publicUsername2 != null) {
                        boolean startsWith = charSequence6.toString().startsWith("@".concat(publicUsername2));
                        charSequence = charSequence6;
                        break;
                    }
                    r52 = charSequence6;
                    charSequence2 = null;
                    if (charSequence2 == null) {
                        String str8 = z4 ? this.t0 : sVar.c;
                        if (!TextUtils.isEmpty(str8)) {
                            String formatName = user != null ? ContactsController.formatName(user.first_name, user.last_name) : r72 != 0 ? r72.monoforum ? bg.e.i(r72, i18, false) : r72.title : null;
                            if (formatName != null && (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(formatName, str8)) != -1) {
                                r52 = new SpannableStringBuilder(formatName);
                                r52.setSpan(new f10(k6.q6, null), indexOfIgnoreCase, str8.length() + indexOfIgnoreCase, 33);
                            }
                            if (arrayList2 == null || arrayList2.size() <= 1) {
                                charSequence3 = charSequence2;
                            } else {
                                String substring = str8.startsWith("@") ? str8.substring(1) : str8;
                                int size6 = arrayList2.size();
                                int i23 = 0;
                                CharSequence charSequence7 = charSequence2;
                                while (true) {
                                    if (i23 < size6) {
                                        TLRPC.TL_username tL_username = arrayList2.get(i23);
                                        i23++;
                                        TLRPC.TL_username tL_username2 = tL_username;
                                        charSequence3 = charSequence7;
                                        if (tL_username2.active && tL_username2.username.startsWith(substring)) {
                                            str4 = tL_username2.username;
                                        } else {
                                            charSequence7 = charSequence3;
                                        }
                                    } else {
                                        charSequence3 = charSequence7;
                                        str4 = null;
                                    }
                                }
                                if (str4 == null) {
                                    int size7 = arrayList2.size();
                                    int i24 = 0;
                                    while (i24 < size7) {
                                        TLRPC.TL_username tL_username3 = arrayList2.get(i24);
                                        i24++;
                                        TLRPC.TL_username tL_username4 = tL_username3;
                                        String str9 = str4;
                                        if (tL_username4.active && tL_username4.username.contains(substring)) {
                                            str5 = tL_username4.username;
                                            if (str5 != null) {
                                                str = str5;
                                            }
                                        } else {
                                            str4 = str9;
                                        }
                                    }
                                }
                                str5 = str4;
                                if (str5 != null) {
                                }
                            }
                            if (str != null && (user == null || O)) {
                                if (str8.startsWith("@")) {
                                    str8 = str8.substring(1);
                                }
                                try {
                                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                                    spannableStringBuilder2.append((CharSequence) "@");
                                    spannableStringBuilder2.append((CharSequence) str);
                                    int indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str, str8);
                                    if (indexOfIgnoreCase2 != -1) {
                                        int length = str8.length();
                                        if (indexOfIgnoreCase2 == 0) {
                                            length++;
                                        } else {
                                            indexOfIgnoreCase2++;
                                        }
                                        charSequence4 = null;
                                        try {
                                            spannableStringBuilder2.setSpan(new f10(k6.q6, null), indexOfIgnoreCase2, length + indexOfIgnoreCase2, 33);
                                        } catch (Exception e6) {
                                            e = e6;
                                            FileLog.e(e);
                                            charSequence3 = str;
                                            str2 = r52;
                                            h6Var.s(false, false);
                                            if (user == null) {
                                            }
                                            charSequence5 = charSequence3;
                                            z11 = false;
                                            str3 = str2;
                                            if (r72 == 0) {
                                            }
                                            if (user != null) {
                                            }
                                            org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 16);
                                            h6Var.y0 = z4;
                                            h6Var.z0 = d1Var;
                                            h6Var.setOnSponsoredOptionsClick(new d4(this, 15));
                                            h6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                            h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z11);
                                            h6Var.s(this.R.a.F2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                                            return;
                                        }
                                    } else {
                                        charSequence4 = null;
                                    }
                                    charSequence3 = spannableStringBuilder2;
                                    str2 = r52;
                                } catch (Exception e10) {
                                    e = e10;
                                    charSequence4 = null;
                                }
                                h6Var.s(false, false);
                                if (user == null && user.id == this.i0 && this.e0 != 16) {
                                    charSequence5 = charSequence4;
                                    z11 = true;
                                    str3 = LocaleController.getString(R.string.SavedMessages);
                                } else {
                                    charSequence5 = charSequence3;
                                    z11 = false;
                                    str3 = str2;
                                }
                                if (r72 == 0 && r72.participants_count != 0) {
                                    String formatPluralStringSpaced = (!ChatObject.isChannel(r72) || r72.megagroup) ? LocaleController.formatPluralStringSpaced("Members", r72.participants_count) : LocaleController.formatPluralStringSpaced("Subscribers", r72.participants_count);
                                    if (charSequence5 instanceof SpannableStringBuilder) {
                                        ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced);
                                    } else {
                                        charSequence5 = !TextUtils.isEmpty(charSequence5) ? TextUtils.concat(charSequence5, ", ", formatPluralStringSpaced) : formatPluralStringSpaced;
                                    }
                                } else if (user != null && user.bot && (i11 = user.bot_active_users) != 0) {
                                    String formatPluralStringSpaced2 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                    if (charSequence5 instanceof SpannableStringBuilder) {
                                        charSequence5 = !TextUtils.isEmpty(charSequence5) ? TextUtils.concat(charSequence5, ", ", formatPluralStringSpaced2) : formatPluralStringSpaced2;
                                        org.telegram.ui.web.d1 d1Var2 = new org.telegram.ui.web.d1(this, 16);
                                        h6Var.y0 = z4;
                                        h6Var.z0 = d1Var2;
                                        h6Var.setOnSponsoredOptionsClick(new d4(this, 15));
                                        h6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                        h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z11);
                                        h6Var.s(this.R.a.F2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                                    } else {
                                        ((SpannableStringBuilder) charSequence5).append((CharSequence) ", ").append((CharSequence) formatPluralStringSpaced2);
                                    }
                                }
                                org.telegram.ui.web.d1 d1Var22 = new org.telegram.ui.web.d1(this, 16);
                                h6Var.y0 = z4;
                                h6Var.z0 = d1Var22;
                                h6Var.setOnSponsoredOptionsClick(new d4(this, 15));
                                h6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                                h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z11);
                                h6Var.s(this.R.a.F2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                            }
                            charSequence4 = null;
                            str2 = r52;
                            h6Var.s(false, false);
                            if (user == null) {
                            }
                            charSequence5 = charSequence3;
                            z11 = false;
                            str3 = str2;
                            if (r72 == 0) {
                            }
                            if (user != null) {
                                String formatPluralStringSpaced22 = LocaleController.formatPluralStringSpaced("BotUsersShort", i11);
                                if (charSequence5 instanceof SpannableStringBuilder) {
                                }
                            }
                            org.telegram.ui.web.d1 d1Var222 = new org.telegram.ui.web.d1(this, 16);
                            h6Var.y0 = z4;
                            h6Var.z0 = d1Var222;
                            h6Var.setOnSponsoredOptionsClick(new d4(this, 15));
                            h6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                            h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z11);
                            h6Var.s(this.R.a.F2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                        }
                    }
                    charSequence3 = charSequence2;
                    charSequence4 = null;
                    str2 = r52;
                    h6Var.s(false, false);
                    if (user == null) {
                    }
                    charSequence5 = charSequence3;
                    z11 = false;
                    str3 = str2;
                    if (r72 == 0) {
                    }
                    if (user != null) {
                    }
                    org.telegram.ui.web.d1 d1Var2222 = new org.telegram.ui.web.d1(this, 16);
                    h6Var.y0 = z4;
                    h6Var.z0 = d1Var2222;
                    h6Var.setOnSponsoredOptionsClick(new d4(this, 15));
                    h6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                    h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z11);
                    h6Var.s(this.R.a.F2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                }
                r52 = 0;
                charSequence2 = charSequence;
                if (charSequence2 == null) {
                }
                charSequence3 = charSequence2;
                charSequence4 = null;
                str2 = r52;
                h6Var.s(false, false);
                if (user == null) {
                }
                charSequence5 = charSequence3;
                z11 = false;
                str3 = str2;
                if (r72 == 0) {
                }
                if (user != null) {
                }
                org.telegram.ui.web.d1 d1Var22222 = new org.telegram.ui.web.d1(this, 16);
                h6Var.y0 = z4;
                h6Var.z0 = d1Var22222;
                h6Var.setOnSponsoredOptionsClick(new d4(this, 15));
                h6Var.setAd(!z10 ? (TLRPC.TL_sponsoredPeer) obj : charSequence4);
                h6Var.t(user == null ? user : r72, encryptedChat2, str3, charSequence5, true, z11);
                h6Var.s(this.R.a.F2.contains(Long.valueOf(h6Var.getDialogId())), dialogId != h6Var.getDialogId());
                break;
            case 1:
                final u3 u3Var = (u3) view;
                if (!arrayList4.isEmpty()) {
                    String string = LocaleController.getString(R.string.Hashtags);
                    String string2 = LocaleController.getString(R.string.ClearButton);
                    final int i25 = r15 ? 1 : 0;
                    u3Var.c(string, string2, new View.OnClickListener(this) { // from class: uf.l
                        public final /* synthetic */ z b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            switch (i25) {
                                case 0:
                                    ay ayVar = this.b.R;
                                    if (ayVar != null) {
                                        ayVar.b();
                                        break;
                                    }
                                    break;
                                case 1:
                                    yx yxVar = ((xn0) this.b).H0;
                                    vn0 vn0Var = yxVar.s0;
                                    xn0 xn0Var = yxVar.V;
                                    String str10 = xn0Var.y;
                                    ArrayList arrayList14 = xn0Var.x;
                                    int i26 = xn0Var.w;
                                    int i27 = xn0Var.v;
                                    ArrayList arrayList15 = vn0Var.L;
                                    if (!TextUtils.equals(str10, vn0Var.V)) {
                                        vn0Var.V();
                                        arrayList15.clear();
                                        arrayList15.addAll(arrayList14);
                                        vn0Var.T = i27;
                                        vn0Var.S = i27 > arrayList14.size();
                                        vn0Var.W = i26;
                                        vn0Var.V = str10;
                                        vn0Var.N(true);
                                    }
                                    yxVar.n0 = true;
                                    yxVar.q0.h1(0, 0);
                                    yxVar.R();
                                    c81 c81Var = yxVar.J;
                                    if (c81Var != null && c81Var.getCurrentTabId() != 1) {
                                        yxVar.J.d(1, 1);
                                    }
                                    vn0Var.Y(yxVar.H0);
                                    break;
                                case 2:
                                    ay ayVar2 = this.b.R;
                                    if (ayVar2 != null) {
                                        ayVar2.b();
                                        break;
                                    }
                                    break;
                                default:
                                    ay ayVar3 = this.b.R;
                                    if (ayVar3 != null) {
                                        ayVar3.b();
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    break;
                } else {
                    if (arrayList6.isEmpty()) {
                        i12 = i16;
                    } else if (i16 == 0) {
                        u3Var.c(LocaleController.getString(R.string.PublicPostsTabs), AndroidUtilities.replaceArrows(LocaleController.getString(R.string.PublicPostsMore), false, AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f)), new View.OnClickListener(this) { // from class: uf.l
                            public final /* synthetic */ z b;

                            {
                                this.b = this;
                            }

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view2) {
                                switch (i19) {
                                    case 0:
                                        ay ayVar = this.b.R;
                                        if (ayVar != null) {
                                            ayVar.b();
                                            break;
                                        }
                                        break;
                                    case 1:
                                        yx yxVar = ((xn0) this.b).H0;
                                        vn0 vn0Var = yxVar.s0;
                                        xn0 xn0Var = yxVar.V;
                                        String str10 = xn0Var.y;
                                        ArrayList arrayList14 = xn0Var.x;
                                        int i26 = xn0Var.w;
                                        int i27 = xn0Var.v;
                                        ArrayList arrayList15 = vn0Var.L;
                                        if (!TextUtils.equals(str10, vn0Var.V)) {
                                            vn0Var.V();
                                            arrayList15.clear();
                                            arrayList15.addAll(arrayList14);
                                            vn0Var.T = i27;
                                            vn0Var.S = i27 > arrayList14.size();
                                            vn0Var.W = i26;
                                            vn0Var.V = str10;
                                            vn0Var.N(true);
                                        }
                                        yxVar.n0 = true;
                                        yxVar.q0.h1(0, 0);
                                        yxVar.R();
                                        c81 c81Var = yxVar.J;
                                        if (c81Var != null && c81Var.getCurrentTabId() != 1) {
                                            yxVar.J.d(1, 1);
                                        }
                                        vn0Var.Y(yxVar.H0);
                                        break;
                                    case 2:
                                        ay ayVar2 = this.b.R;
                                        if (ayVar2 != null) {
                                            ayVar2.b();
                                            break;
                                        }
                                        break;
                                    default:
                                        ay ayVar3 = this.b.R;
                                        if (ayVar3 != null) {
                                            ayVar3.b();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else {
                        i12 = yh.e(1, i16, arrayList6);
                    }
                    ArrayList arrayList14 = sVar.e;
                    ArrayList arrayList15 = sVar.j;
                    boolean P = P();
                    ArrayList arrayList16 = this.B;
                    if (P || !arrayList7.isEmpty() || !arrayList16.isEmpty() || !arrayList6.isEmpty()) {
                        ?? M = M();
                        if (i12 >= M) {
                            if (i12 != M || !P()) {
                                if (i12 == K() + (arrayList7.isEmpty() ? 0 : arrayList7.size() + 1) + (arrayList16.isEmpty() ? 0 : arrayList16.size() + 1) && !this.s.isEmpty()) {
                                    u3Var.setText(LocaleController.getString(R.string.SearchAllChatsShort));
                                    break;
                                } else {
                                    i12 -= K();
                                }
                            } else if (!this.K) {
                                final int i26 = 2;
                                u3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.ClearButton), new View.OnClickListener(this) { // from class: uf.l
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i26) {
                                            case 0:
                                                ay ayVar = this.b.R;
                                                if (ayVar != null) {
                                                    ayVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                yx yxVar = ((xn0) this.b).H0;
                                                vn0 vn0Var = yxVar.s0;
                                                xn0 xn0Var = yxVar.V;
                                                String str10 = xn0Var.y;
                                                ArrayList arrayList142 = xn0Var.x;
                                                int i262 = xn0Var.w;
                                                int i27 = xn0Var.v;
                                                ArrayList arrayList152 = vn0Var.L;
                                                if (!TextUtils.equals(str10, vn0Var.V)) {
                                                    vn0Var.V();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    vn0Var.T = i27;
                                                    vn0Var.S = i27 > arrayList142.size();
                                                    vn0Var.W = i262;
                                                    vn0Var.V = str10;
                                                    vn0Var.N(true);
                                                }
                                                yxVar.n0 = true;
                                                yxVar.q0.h1(0, 0);
                                                yxVar.R();
                                                c81 c81Var = yxVar.J;
                                                if (c81Var != null && c81Var.getCurrentTabId() != 1) {
                                                    yxVar.J.d(1, 1);
                                                }
                                                vn0Var.Y(yxVar.H0);
                                                break;
                                            case 2:
                                                ay ayVar2 = this.b.R;
                                                if (ayVar2 != null) {
                                                    ayVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ay ayVar3 = this.b.R;
                                                if (ayVar3 != null) {
                                                    ayVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            } else {
                                final int i27 = 3;
                                u3Var.c(LocaleController.getString(R.string.Recent), LocaleController.getString(R.string.Clear), new View.OnClickListener(this) { // from class: uf.l
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view2) {
                                        switch (i27) {
                                            case 0:
                                                ay ayVar = this.b.R;
                                                if (ayVar != null) {
                                                    ayVar.b();
                                                    break;
                                                }
                                                break;
                                            case 1:
                                                yx yxVar = ((xn0) this.b).H0;
                                                vn0 vn0Var = yxVar.s0;
                                                xn0 xn0Var = yxVar.V;
                                                String str10 = xn0Var.y;
                                                ArrayList arrayList142 = xn0Var.x;
                                                int i262 = xn0Var.w;
                                                int i272 = xn0Var.v;
                                                ArrayList arrayList152 = vn0Var.L;
                                                if (!TextUtils.equals(str10, vn0Var.V)) {
                                                    vn0Var.V();
                                                    arrayList152.clear();
                                                    arrayList152.addAll(arrayList142);
                                                    vn0Var.T = i272;
                                                    vn0Var.S = i272 > arrayList142.size();
                                                    vn0Var.W = i262;
                                                    vn0Var.V = str10;
                                                    vn0Var.N(true);
                                                }
                                                yxVar.n0 = true;
                                                yxVar.q0.h1(0, 0);
                                                yxVar.R();
                                                c81 c81Var = yxVar.J;
                                                if (c81Var != null && c81Var.getCurrentTabId() != 1) {
                                                    yxVar.J.d(1, 1);
                                                }
                                                vn0Var.Y(yxVar.H0);
                                                break;
                                            case 2:
                                                ay ayVar2 = this.b.R;
                                                if (ayVar2 != null) {
                                                    ayVar2.b();
                                                    break;
                                                }
                                                break;
                                            default:
                                                ay ayVar3 = this.b.R;
                                                if (ayVar3 != null) {
                                                    ayVar3.b();
                                                    break;
                                                }
                                                break;
                                        }
                                    }
                                });
                                break;
                            }
                        } else {
                            u3Var.setText(LocaleController.getString(R.string.ChatHints));
                            break;
                        }
                    }
                    int size8 = this.s.size();
                    int size9 = sVar.d.size();
                    int size10 = arrayList15.size();
                    if (size10 > 3 && this.E0) {
                        size10 = 3;
                    }
                    int size11 = arrayList14.size();
                    if (size11 > 3 && this.D0) {
                        size11 = 3;
                    }
                    int size12 = (arrayList14.isEmpty() && arrayList5.isEmpty()) ? 0 : arrayList5.size() + size11 + 1;
                    int size13 = arrayList3.isEmpty() ? 0 : arrayList3.size() + 1;
                    ArrayList arrayList17 = this.F;
                    if (!arrayList17.isEmpty()) {
                        arrayList17.size();
                    }
                    int i28 = size13;
                    if (this.c != w.d || this.d) {
                        arrayList17.isEmpty();
                    }
                    if (arrayList7.isEmpty()) {
                        i13 = 1;
                        str6 = null;
                    } else {
                        str6 = i12 == 0 ? LocaleController.getString(R.string.Topics) : null;
                        i13 = 1;
                        i12 = yh.e(1, i12, arrayList7);
                    }
                    if (!arrayList16.isEmpty()) {
                        if (i12 == 0) {
                            str6 = LocaleController.getString(R.string.InviteToTelegramShort);
                        }
                        i12 = yh.e(i13, i12, arrayList16);
                    }
                    if (str6 == null) {
                        int i29 = i12 - (size8 + size9);
                        if (i29 < 0 || i29 >= size10) {
                            int i30 = i29 - size10;
                            if (i30 < 0 || i30 >= size12) {
                                if (this.R == null || i28 <= 0) {
                                    i14 = 1;
                                } else {
                                    i14 = 1;
                                    if (i30 - size12 <= 1) {
                                        TLRPC.Chat chat6 = MessagesController.getInstance(i18).getChat(Long.valueOf(-this.R.a()));
                                        int i31 = R.string.SearchMessagesIn;
                                        if (chat6 == null) {
                                            i15 = BuildConfig.BETA_URL;
                                            c3 = 0;
                                        } else {
                                            c3 = 0;
                                            i15 = chat6.monoforum ? bg.e.i(chat6, i18, false) : chat6.title;
                                        }
                                        Object[] objArr = new Object[1];
                                        objArr[c3] = i15;
                                        str6 = LocaleController.formatString(i31, objArr);
                                    }
                                }
                                this.C0 = i30;
                                SpannableStringBuilder H = H(this.c);
                                Runnable runnable2 = new Runnable(this) { // from class: uf.m
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i14) {
                                            case 0:
                                                z zVar = this.b;
                                                boolean z14 = zVar.E0;
                                                zVar.E0 = !z14;
                                                u3Var.setRightText(LocaleController.getString(!z14 ? R.string.ShowMore : R.string.ShowLess));
                                                zVar.l();
                                                break;
                                            default:
                                                z zVar2 = this.b;
                                                py pyVar = zVar2.o0;
                                                u3 u3Var2 = u3Var;
                                                q70 H2 = q70.H(pyVar, u3Var2);
                                                for (w wVar : w.values()) {
                                                    boolean z15 = wVar.a == zVar2.c.a;
                                                    H2.i(new dg.t0(zVar2, z15, u3Var2, wVar, 27), LocaleController.getString(wVar.b), z15);
                                                }
                                                H2.V(5);
                                                H2.Y = true;
                                                H2.t = false;
                                                H2.s = 0;
                                                H2.Z();
                                                break;
                                        }
                                    }
                                };
                                str6 = LocaleController.getString(R.string.SearchMessages);
                                runnable = runnable2;
                                spannableStringBuilder = H;
                                z12 = false;
                            } else {
                                String string3 = LocaleController.getString(R.string.GlobalSearch);
                                if (sVar.e.size() > 3) {
                                    z12 = this.D0;
                                    dt dtVar = new dt(this, arrayList14, i10, u3Var, 14);
                                    u3Var = u3Var;
                                    str6 = string3;
                                    runnable = dtVar;
                                    spannableStringBuilder = null;
                                } else {
                                    str6 = string3;
                                }
                            }
                        } else {
                            str6 = LocaleController.getString(R.string.PhoneNumberSearch);
                            if (arrayList15.size() > 3) {
                                final int i32 = 0;
                                z12 = this.E0;
                                runnable = new Runnable(this) { // from class: uf.m
                                    public final /* synthetic */ z b;

                                    {
                                        this.b = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i32) {
                                            case 0:
                                                z zVar = this.b;
                                                boolean z14 = zVar.E0;
                                                zVar.E0 = !z14;
                                                u3Var.setRightText(LocaleController.getString(!z14 ? R.string.ShowMore : R.string.ShowLess));
                                                zVar.l();
                                                break;
                                            default:
                                                z zVar2 = this.b;
                                                py pyVar = zVar2.o0;
                                                u3 u3Var2 = u3Var;
                                                q70 H2 = q70.H(pyVar, u3Var2);
                                                for (w wVar : w.values()) {
                                                    boolean z15 = wVar.a == zVar2.c.a;
                                                    H2.i(new dg.t0(zVar2, z15, u3Var2, wVar, 27), LocaleController.getString(wVar.b), z15);
                                                }
                                                H2.V(5);
                                                H2.Y = true;
                                                H2.t = false;
                                                H2.s = 0;
                                                H2.Z();
                                                break;
                                        }
                                    }
                                };
                                spannableStringBuilder = null;
                            }
                        }
                        if (runnable == null) {
                            if (spannableStringBuilder == null) {
                                u3Var.c(str6, LocaleController.getString(z12 ? R.string.ShowMore : R.string.ShowLess), new jg.u(5, runnable));
                                u3Var.setRightTextMargin(16);
                                break;
                            } else {
                                u3Var.c(str6, spannableStringBuilder, new jg.u(6, runnable));
                                u3Var.setRightTextMargin(6);
                                break;
                            }
                        } else {
                            u3Var.setText(str6);
                            break;
                        }
                    }
                    spannableStringBuilder = null;
                    runnable = null;
                    z12 = false;
                    if (runnable == null) {
                    }
                }
                break;
            case 2:
            case 9:
                r2 r2Var = (r2) view;
                r2Var.setBackgroundColor(k6.w0(null, k6.d6, false));
                r2Var.p2 = i16 != h() - 1;
                MessageObject messageObject = (MessageObject) J(i16);
                r2Var.L = arrayList3.contains(messageObject);
                if (messageObject != null) {
                    r2Var.W(messageObject.getDialogId(), messageObject, messageObject.messageOwner.date, false, false);
                    break;
                } else {
                    r2Var.W(0L, null, 0, false, false);
                    break;
                }
            case 3:
                ((oa) view).setTopic((TLRPC.TL_forumTopic) J(i16));
                break;
            case 5:
                l4 l4Var = (l4) view;
                l4Var.setBackgroundColor(k6.w0(null, k6.d6, false));
                l4Var.setText((CharSequence) arrayList4.get(i16 - 1));
                l4Var.setNeedDivider(i16 != arrayList4.size());
                break;
            case 6:
                ((t) ((tl0) view).getAdapter()).l();
                break;
            case 7:
                String str10 = (String) J(i16);
                o8 o8Var = (o8) view;
                o8Var.e(-1, k6.o6);
                o8Var.i(LocaleController.formatString("AddContactByPhone", R.string.AddContactByPhone, se.b.c().b("+" + str10)), false);
                break;
            case 8:
                h6 h6Var2 = (h6) view;
                ContactsController.Contact contact = (ContactsController.Contact) J(i16);
                h6Var2.t(contact, null, ContactsController.formatName(contact.first_name, contact.last_name), y3.j(new StringBuilder("+"), contact.shortPhones.get(0), se.b.c()), false, false);
                break;
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = this.e0;
        g6 g6Var = null;
        Context context = this.e;
        switch (i10) {
            case 0:
                h6 h6Var = new h6(context, null);
                h6Var.i0 = i11 == 3;
                view = h6Var;
                view2 = view;
                break;
            case 1:
                view2 = new u3(context, null);
                break;
            case 2:
            case 9:
                view2 = new ju0(2, context, true ? 1 : 0);
                break;
            case 3:
                view2 = new oa(context);
                break;
            case 4:
                u00 u00Var = new u00(context, null);
                u00Var.setViewType(1);
                u00Var.setIsSingleCell(true);
                view2 = u00Var;
                break;
            case 5:
                l4 l4Var = new l4(context);
                l4Var.setGravity(16);
                l4Var.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
                l4Var.setTextSize(1, 17.0f);
                l4Var.setTextColor(k6.w0(null, k6.G6, false));
                view2 = l4Var;
                break;
            case 6:
                kb1 kb1Var = new kb1(context, 13, g6Var);
                kb1Var.setSelectorDrawableColor(k6.w0(null, k6.i6, false));
                kb1Var.setTag(9);
                kb1Var.setItemAnimator(null);
                kb1Var.setLayoutAnimation(null);
                org.telegram.ui.k kVar = new org.telegram.ui.k(19);
                kVar.j1(0);
                kb1Var.setLayoutManager(kVar);
                kb1Var.setAdapter(new t(this.p0, this.e, null, false, i11 == 3));
                kb1Var.setOnItemClickListener(new ag.h(this, 21));
                kb1Var.setOnItemLongClickListener(new r(this));
                this.h0 = kb1Var;
                view = kb1Var;
                view2 = view;
                break;
            case 7:
            default:
                view2 = new o8(16, context, false);
                break;
            case 8:
                view2 = new h6(context, null);
                break;
            case 10:
                p pVar = new p(this, true ? 1 : 0);
                v vVar = new v(context);
                vVar.setOrientation(1);
                p9 p9Var = new p9(context);
                p9Var.setImageDrawable(new ij0(R.raw.utyan_empty, AndroidUtilities.dp(120.0f), "utyan_empty", AndroidUtilities.dp(120.0f)));
                vVar.addView(p9Var, c6.t(120, 120, 1, 0, 27, 0, 0));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 17.0f);
                int i12 = k6.G6;
                textView.setTextColor(k6.w0(null, i12, false));
                textView.setTypeface(AndroidUtilities.bold());
                y3.r(R.string.SearchMessagesFilterEmptyTitle, textView, 17);
                vVar.addView(textView, c6.t(-1, -2, 1, 0, 8, 0, 9));
                TextView textView2 = new TextView(context);
                vVar.a = textView2;
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(k6.w0(null, i12, false));
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, ""));
                textView2.setGravity(17);
                vVar.addView(textView2, c6.t(-1, -2, 1, 0, 0, 0, 14));
                TextView textView3 = new TextView(context);
                textView3.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(4.0f));
                textView3.setTextSize(1, 14.0f);
                textView3.setText(LocaleController.getString(R.string.SearchMessagesFilterEmptySearchAll));
                int i13 = k6.Oh;
                textView3.setTextColor(k6.w0(null, i13, false));
                int l1 = k6.l1(0.15f, k6.w0(null, i13, false));
                textView3.setBackground(k6.i0(6, 6, 6, 6, 0, l1, l1));
                textView3.setOnClickListener(new org.telegram.ui.Components.voip.o(pVar, 20));
                vVar.addView(textView3, c6.t(-2, -2, 1, 0, 0, 0, 38));
                this.B0 = vVar;
                textView2.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, this.W));
                view2 = vVar;
                break;
        }
        if (i10 == 5) {
            view2.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(86.0f)));
        } else {
            view2.setLayoutParams(new f2.x0(-1, -2));
        }
        return new fl0(view2);
    }
}
