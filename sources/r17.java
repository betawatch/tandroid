// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import j$.util.List;
import j$.util.Map;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class r17 extends c79 implements fn7 {
    public Location A0;
    public ArrayList B0;
    public HashMap C0;
    public zh6 E;
    public String E0;
    public n17 F;
    public int F0;
    public String G;
    public nr6 G0;
    public p17 H;
    public zu1 H0;
    public p17 I;
    public final vnb I0;
    public ArrayList J;
    public ArrayList K;
    public final u8a K0;
    public ArrayList L;
    public Object[] L0;
    public String M;
    public ArrayList N;
    public ArrayList O;
    public String[] P;
    public ArrayList Q;
    public ArrayList R;
    public ArrayList S;
    public long T;
    public TLRPC.TL_inlineBotSwitchPM U;
    public TLRPC.TL_inlineBotWebView V;
    public final w17 W;
    public zh6 X;
    public int Y;
    public int Z;
    public String a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public ArrayList e0;
    public final Context h;
    public int h0;
    public int j0;
    public int k0;
    public boolean l0;
    public TLRPC.Chat m0;
    public long n;
    public h04 o0;
    public boolean p0;
    public yg6 q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public String t0;
    public int u0;
    public int v0;
    public TLRPC.ChatFull w;
    public boolean w0;
    public final sv9 x;
    public TLRPC.User x0;
    public ArrayList y;
    public boolean y0;
    public k17 z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = yac.t0;
    public boolean f0 = true;
    public boolean g0 = true;
    public boolean i0 = true;
    public boolean n0 = false;
    public final ArrayList D0 = new ArrayList();
    public final j17 J0 = new j17(this, new i17(this));
    public boolean M0 = false;
    public int N0 = -1;

    public r17(Context context, long j, long j2, w17 w17Var, vnb vnbVar, boolean z) {
        this.I0 = vnbVar;
        this.h = context;
        this.W = w17Var;
        this.n = j;
        this.s = z;
        this.r = j2;
        sv9 sv9Var = new sv9(true);
        this.x = sv9Var;
        sv9Var.a = new kj4((Object) this, (byte) 18);
        u8a u8aVar = (u8a) new ou0(jn7.f(this.f), this).b;
        u8aVar.b(jn7.X0);
        u8aVar.b(jn7.x0);
        this.K0 = u8aVar;
        u8aVar.b(jn7.Y1);
        u8aVar.b(jn7.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i++;
        }
        return false;
    }

    @Override // c79
    public final boolean D(f89 f89Var) {
        return (this.x0 == null || this.i0) && this.B0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.C0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (yac.h(this.f).p() || !r47.W3(document)) {
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new q17(str, document));
                this.C0.put(str2, document);
                h04 h04Var = this.o0;
                if (h04Var != null) {
                    h04Var.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        Object obj = str;
        while (i < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.C0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (yac.h(this.f).p() || !r47.W3(document))) {
                int size2 = document.attributes.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i2);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i2++;
                }
                if (this.B0 == null) {
                    this.B0 = new ArrayList();
                    this.C0 = new HashMap();
                }
                this.B0.add(new q17(obj, document));
                this.C0.put(str2, document);
            }
            i++;
            obj = obj;
        }
    }

    public final void G() {
        zu1 zu1Var = this.H0;
        if (zu1Var == null || zu1Var.getParentActivity() == null) {
            return;
        }
        if (this.H0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.H0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.J0.m();
    }

    public final void H() {
        if (this.B0 == null) {
            return;
        }
        ArrayList arrayList = this.D0;
        arrayList.clear();
        int min = Math.min(6, this.B0.size());
        for (int i = 0; i < min; i++) {
            q17 q17Var = (q17) this.B0.get(i);
            TLRPC.PhotoSize w = xb4.w(q17Var.a.thumbs, 90, false, null, false);
            if ((w instanceof TLRPC.TL_photoSize) || (w instanceof TLRPC.TL_photoSizeProgressive)) {
                xb4.G(this.f);
                if (!xb4.J(w, "webp", true, true).exists()) {
                    arrayList.add(xb4.r("webp", w));
                    xb4.G(this.f).V(jn5.c(w, q17Var.a), q17Var.b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.x0;
        if (user == null || user.id == this.T) {
            return this.U;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0083, code lost:
    
        if (r6.K != null) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J(int i) {
        String str;
        TLRPC.User user = null;
        if (this.G != null) {
            if (i >= 2) {
                i -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.V;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i >= 0 && i < arrayList2.size()) {
                        return this.S.get(i);
                    }
                } else if (i == 0) {
                    return tL_inlineBotWebView;
                }
                i--;
                if (i >= 0) {
                    return this.S.get(i);
                }
            } else {
                ArrayList arrayList3 = this.y;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.J;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.O;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.N;
                            if (arrayList6 != null) {
                                if (i >= 0 && i < arrayList6.size()) {
                                    return this.N.get(i);
                                }
                                ArrayList arrayList7 = this.N;
                                if (arrayList7 != null) {
                                    i -= arrayList7.size();
                                }
                            }
                            ArrayList arrayList8 = this.K;
                            if (arrayList8 != null && i >= 0 && i < arrayList8.size()) {
                                ArrayList arrayList9 = this.Q;
                                if (arrayList9 == null || (this.h0 == 1 && !(this.w instanceof TLRPC.TL_channelFull))) {
                                    str = (String) this.K.get(i);
                                } else if (arrayList9.get(i) != null) {
                                    user = (TLRPC.User) this.Q.get(i);
                                    str = String.format("%s@%s", this.K.get(i), user != null ? lbc.p(user) : "");
                                } else {
                                    str = String.format("%s", this.K.get(i));
                                }
                                ArrayList arrayList10 = this.R;
                                if (arrayList10 == null || !((Boolean) arrayList10.get(i)).booleanValue()) {
                                    return str;
                                }
                                return new o17(str, user != null ? user.id : 0L);
                            }
                        } else if (i >= 0 && i < arrayList5.size()) {
                            return this.O.get(i);
                        }
                    } else if (i >= 0 && i < arrayList4.size()) {
                        return this.J.get(i);
                    }
                } else if (i >= 0 && i < arrayList3.size()) {
                    return this.y.get(i);
                }
            }
        } else if (i >= 0 && i < arrayList.size()) {
            return ((q17) this.B0.get(i)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i = 1;
        if (this.x0 != null && !this.i0) {
            return 1;
        }
        int i2 = this.G != null ? 2 : 0;
        ArrayList arrayList = this.B0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.S;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.U == null && this.V == null) {
                    i = 0;
                }
                return size2 + i + i2;
            }
            ArrayList arrayList3 = this.y;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.J;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else {
                    if (this.K != null || this.N != null) {
                        ArrayList arrayList5 = this.N;
                        int size3 = arrayList5 == null ? 0 : arrayList5.size();
                        ArrayList arrayList6 = this.K;
                        return size3 + (arrayList6 != null ? arrayList6.size() : 0) + i2;
                    }
                    ArrayList arrayList7 = this.O;
                    if (arrayList7 == null) {
                        return i2;
                    }
                    size = arrayList7.size();
                }
            }
        }
        return size + i2;
    }

    public final Object L(int i) {
        if (this.G != null) {
            if (i < 2) {
                return null;
            }
            i -= 2;
        }
        ArrayList arrayList = this.B0;
        if (arrayList == null || i < 0 || i >= arrayList.size()) {
            return null;
        }
        return ((q17) this.B0.get(i)).b;
    }

    public final int M(int i) {
        if (this.G != null) {
            if (i < 2) {
                return 0;
            }
            i -= 2;
        }
        return this.S != null ? (this.U == null && this.V == null) ? i : i - 1 : i;
    }

    public final boolean N() {
        return this.B0 != null;
    }

    public final void P() {
        j17 j17Var = this.J0;
        if (j17Var != null) {
            j17Var.n();
        }
        k17 k17Var = this.z0;
        if (k17Var != null) {
            hl.r(k17Var);
            this.z0 = null;
        }
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        this.x0 = null;
        this.U = null;
        this.i0 = true;
        this.r0 = null;
        this.s0 = null;
        this.w0 = false;
        this.K0.a();
    }

    public final void Q() {
        TLRPC.User user = this.x0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.A0 = location;
        location.setLatitude(-1000.0d);
        this.A0.setLongitude(-1000.0d);
        T(true, this.x0, this.s0, "");
    }

    public final void R(TLRPC.User user) {
        r17 r17Var;
        zu1 zu1Var;
        TLRPC.Chat chat;
        this.u0 = 0;
        this.J0.n();
        w17 w17Var = this.W;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            r17Var = this;
            r17Var.x0 = null;
            r17Var.U = null;
            r17Var.i0 = true;
        } else {
            this.x0 = user;
            long j = user.id;
            if (j != this.T) {
                this.U = null;
                this.T = j;
            }
            zu1 zu1Var2 = this.H0;
            if (zu1Var2 != null && (chat = zu1Var2.e) != null) {
                boolean t = xc2.t(chat);
                this.i0 = t;
                if (!t) {
                    f();
                    w17Var.a(true);
                    return;
                }
            }
            if (this.x0.bot_inline_geo) {
                if (uc7.s1(this.f).X3.getBoolean("inlinegeo_" + this.x0.id, false) || (zu1Var = this.H0) == null || zu1Var.getParentActivity() == null) {
                    r17Var = this;
                    r17Var.G();
                } else {
                    TLRPC.User user2 = this.x0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.H0.getParentActivity());
                    String M0 = ob6.M0(2131745151, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.S = M0;
                    idVar.U = ob6.M0(2131745152, null);
                    boolean[] zArr = new boolean[1];
                    r17Var = this;
                    alertDialog$Builder.j(ob6.M0(2131747558, null), new fu2(r17Var, zArr, user2, false, (byte) 19));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), new rm6(r17Var, zArr, (byte) 8));
                    r17Var.H0.showDialog(idVar, new gf(r17Var, zArr, (byte) 11));
                }
            } else {
                r17Var = this;
            }
        }
        if (r17Var.x0 == null) {
            r17Var.w0 = true;
            r17Var.U = null;
        } else {
            if (w17Var != null) {
                w17Var.b(true);
            }
            r17Var.T(true, r17Var.x0, r17Var.s0, "");
        }
    }

    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.x0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.s0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.x0;
            w17 w17Var = this.W;
            if (user2 != null) {
                if (!this.i0 && str != null && str2 != null) {
                    return;
                } else {
                    w17Var.a(false);
                }
            }
            k17 k17Var = this.z0;
            if (k17Var != null) {
                hl.r(k17Var);
                this.z0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.r0) != null && !str3.equals(str))) {
                if (this.u0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                    this.u0 = 0;
                }
                if (this.v0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                    this.v0 = 0;
                }
                this.x0 = null;
                this.U = null;
                this.i0 = true;
                this.r0 = null;
                this.s0 = null;
                this.J0.n();
                this.w0 = false;
                if (w17Var != null) {
                    w17Var.b(false);
                }
                if (str == null || str.length() == 0) {
                    return;
                }
            }
            if (str2 == null) {
                if (this.v0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
                    this.v0 = 0;
                }
                this.s0 = null;
                if (w17Var != null) {
                    w17Var.b(false);
                    return;
                }
                return;
            }
            if (w17Var != null) {
                if (this.x0 != null) {
                    w17Var.b(true);
                } else if (str.equals("gif")) {
                    this.r0 = "gif";
                    w17Var.b(false);
                }
            }
            uc7 s1 = uc7.s1(this.f);
            kf7 a0 = kf7.a0(this.f);
            this.s0 = str2;
            k17 k17Var2 = new k17(this, str2, str, s1, a0);
            this.z0 = k17Var2;
            hl.d3(k17Var2, 400L);
        }
    }

    public final void T(boolean z, TLRPC.User user, String str, String str2) {
        Location location;
        if (this.v0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.v0, true);
            this.v0 = 0;
        }
        if (!this.i0 || !this.d) {
            w17 w17Var = this.W;
            if (w17Var != null) {
                w17Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.s0 = null;
            return;
        }
        if (user.bot_inline_geo && this.A0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        sb.append("_");
        sb.append(str);
        ik8.z("_", str2, "_", sb);
        sb.append(this.n);
        sb.append("_");
        sb.append(user.id);
        sb.append("_");
        sb.append((!user.bot_inline_geo || this.A0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.A0.getLongitude() + this.A0.getLatitude()));
        String sb2 = sb.toString();
        kf7 a0 = kf7.a0(this.f);
        h17 h17Var = new h17(this, str, z, user, str2, a0, sb2);
        long j = user.id;
        if (j != this.T) {
            this.U = null;
            this.T = j;
        }
        if (z) {
            a0.N(sb2, h17Var);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = uc7.s1(this.f).q1(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.A0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = hl.b0(this.A0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = hl.b0(this.A0.getLongitude());
        }
        if (wf3.B(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = uc7.s1(this.f).j1(this.n);
        }
        this.v0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, h17Var, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:224:0x06f7, code lost:
    
        if (r17.toLowerCase().startsWith(r3) == false) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x070a, code lost:
    
        if (r14.toLowerCase().startsWith(r3) != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x071a, code lost:
    
        if (r15.toLowerCase().startsWith(r3) != false) goto L400;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x06ac, code lost:
    
        if (r13.user_id == r11.id) goto L381;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x03d4, code lost:
    
        if (r6 != ':') goto L262;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x03ec, code lost:
    
        if (r28.w != null) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x03ee, code lost:
    
        if (r12 == 0) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x03f0, code lost:
    
        r28.a0 = r7;
        r28.d0 = r3;
        r28.e0 = r4;
        r28.W.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x03fc, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x03fd, code lost:
    
        r28.Y = r12;
        r28.Z = r13.length() + 1;
        r0 = 0;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x04a4, code lost:
    
        r28.Y = r12;
        r28.Z = r13.length() + r11;
        r0 = 3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:223:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0733 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x04d7  */
    /* JADX WARN: Type inference failed for: r0v59, types: [w17] */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v21, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v39, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v58, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v59 */
    /* JADX WARN: Type inference failed for: r11v90 */
    /* JADX WARN: Type inference failed for: r28v0, types: [j79, java.lang.Object, r17] */
    /* JADX WARN: Type inference failed for: r5v16, types: [p17] */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.util.ArrayList, zh6] */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r9v39, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        boolean z3;
        String str;
        int i2;
        ArrayList arrayList2;
        String str2;
        zu1 zu1Var;
        char c;
        int i3;
        String str3;
        String str4;
        int i4;
        boolean z4;
        int i5;
        ?? r5;
        p17 p17Var;
        ?? r6;
        ArrayList arrayList3;
        String str5;
        String str6;
        long j;
        TLRPC.Chat M0;
        TLRPC.ChatFull chatFull;
        int i6;
        long j2;
        boolean z5;
        String str7;
        String p;
        String str8;
        TLRPC.Chat chat;
        long j3;
        TLRPC.Chat chat2;
        boolean z6;
        String str9 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.m0;
        zu1 zu1Var2 = this.H0;
        if (zu1Var2 != null) {
            chat3 = zu1Var2.e;
            zu1Var2.h();
        }
        TLRPC.Chat chat4 = chat3;
        yg6 yg6Var = this.q0;
        if (yg6Var != null) {
            hl.r(yg6Var);
            this.q0 = null;
        }
        if (this.k0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.k0, true);
            this.k0 = 0;
        }
        n17 n17Var = this.F;
        if (n17Var != null) {
            hl.r(n17Var);
            this.F = null;
        }
        nr6 nr6Var = this.G0;
        if (nr6Var != null) {
            hl.r(nr6Var);
            this.G0 = null;
        }
        if (TextUtils.isEmpty(charSequence2) || charSequence2.length() > uc7.s1(this.f).t1()) {
            S(null, null);
            this.W.a(false);
            this.a0 = null;
            this.E0 = null;
            this.B0 = null;
            this.C0 = null;
            f();
            this.p0 = false;
            if (this.F0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.F0, true);
                this.F0 = 0;
            }
            h04 h04Var = this.o0;
            if (h04Var != null) {
                h04Var.a();
                return;
            }
            return;
        }
        int i7 = charSequence2.length() > 0 ? i - 1 : i;
        this.a0 = null;
        this.c0 = z;
        this.b0 = z2;
        StringBuilder sb = new StringBuilder();
        boolean z7 = !z && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z7) {
            int length = charSequence2.length();
            z3 = true;
            int i8 = 0;
            CharSequence charSequence3 = charSequence2;
            while (i8 < length) {
                char charAt = charSequence3.charAt(i8);
                int i9 = length - 1;
                char charAt2 = i8 < i9 ? charSequence3.charAt(i8 + 1) : (char) 0;
                if (i8 < i9 && charAt == 55356 && charAt2 >= 57339 && charAt2 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i8), charSequence3.subSequence(i8 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i8), charSequence3.subSequence(i8 + 1, charSequence3.length()));
                    length--;
                } else {
                    i8++;
                }
                i8--;
                i8++;
            }
            this.E0 = charSequence3.toString().trim();
            str = charSequence2;
        } else {
            z3 = true;
            str = "";
        }
        boolean z8 = (z7 && (pv3.h(str) || pv3.h(this.E0))) ? z3 : false;
        if (z8 && (charSequence instanceof Spanned)) {
            hm[] hmVarArr = (hm[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), hm.class);
            z8 = (hmVarArr == null || hmVarArr.length == 0) ? z3 : false;
        }
        int i10 = i7;
        if (this.c && z8 && (chat4 == null || xc2.t(chat4))) {
            this.D0.clear();
            int i11 = xea.D;
            if (i11 == 2 || !z8) {
                if (this.p0 && i11 == 2) {
                    this.p0 = false;
                    this.W.a(false);
                    f();
                    return;
                }
                return;
            }
            this.B0 = null;
            this.C0 = null;
            if (this.F0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.F0, z3);
                this.F0 = 0;
            }
            boolean z9 = uc7.s1(this.f).l4.Y0.f;
            if (z9) {
                i2 = i;
                arrayList2 = arrayList;
                z6 = z9;
            } else {
                arrayList2 = arrayList;
                z6 = z9;
                i2 = i;
                this.G0 = new nr6((r17) this, charSequence, i2, arrayList2, z, z2);
                ls6.d0(this.f).X0(false, true, false, 0);
                ls6.d0(this.f).X0(false, true, false, 2);
                ArrayList arrayList4 = ls6.d0(this.f).g0[0];
                ArrayList arrayList5 = ls6.d0(this.f).g0[2];
                int min = Math.min(20, arrayList4.size());
                int i12 = 0;
                for (int i13 = 0; i13 < min; i13++) {
                    TLRPC.Document document = (TLRPC.Document) arrayList4.get(i13);
                    if (O(document, this.E0)) {
                        E(document, "recent");
                        int i14 = i12 + 1;
                        if (i14 >= 5) {
                            break;
                        } else {
                            i12 = i14;
                        }
                    }
                }
                int size = arrayList5.size();
                for (int i15 = 0; i15 < size; i15++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList5.get(i15);
                    if (O(document2, this.E0)) {
                        E(document2, "fav");
                    }
                }
                ls6.d0(this.f).D(0);
                HashMap hashMap = ls6.d0(this.f).e0;
                ArrayList arrayList6 = hashMap != null ? (ArrayList) hashMap.get(this.E0) : null;
                if (arrayList6 != null && !arrayList6.isEmpty()) {
                    F(null, arrayList6);
                }
                ArrayList arrayList7 = this.B0;
                if (arrayList7 != null) {
                    Collections.sort(arrayList7, new l17(arrayList5, arrayList4));
                }
            }
            if (xea.D == 0 || z6) {
                String str10 = this.E0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str;
                tL_messages_getStickers.hash = 0L;
                this.F0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new mw3(this, str10, (byte) 27));
            }
            ArrayList arrayList8 = this.B0;
            if (arrayList8 != null && !arrayList8.isEmpty()) {
                if (xea.D != 0 || this.B0.size() >= 5) {
                    H();
                    this.W.a(this.D0.isEmpty());
                    this.p0 = true;
                } else {
                    this.W.a(false);
                    this.p0 = false;
                }
                f();
            } else if (this.p0) {
                this.W.a(false);
                this.p0 = false;
            }
            c = 4;
            str2 = null;
        } else {
            i2 = i;
            arrayList2 = arrayList;
            if (!z && this.g0 && charSequence2.charAt(0) == '@') {
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str4 = charSequence2.substring(indexOf + 1);
                    str3 = substring;
                    i3 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i3 = 1;
                    str3 = charSequence2.substring(1);
                    str4 = "";
                } else {
                    i3 = 1;
                    S(null, null);
                    str3 = null;
                    str4 = null;
                }
                if (str3 != null && str3.length() >= i3) {
                    int i16 = 1;
                    while (true) {
                        if (i16 >= str3.length()) {
                            str9 = str3;
                            break;
                        }
                        char charAt3 = str3.charAt(i16);
                        if ((charAt3 < '0' || charAt3 > '9') && ((charAt3 < 'a' || charAt3 > 'z') && ((charAt3 < 'A' || charAt3 > 'Z') && charAt3 != '_'))) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
                S(str9, str4);
                str2 = null;
            } else if (!this.c || (zu1Var = this.H0) == null || zu1Var.h != null || (!(chat4 == null || xc2.t(chat4)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                str2 = null;
                S(null, null);
            } else {
                str2 = null;
                S(null, null);
            }
            c = 65535;
        }
        if (this.x0 == null) {
            uc7 s1 = uc7.s1(this.f);
            String str11 = this.G;
            this.G = str2;
            if (z) {
                sb.append(charSequence2.substring(1));
                this.Y = 0;
                this.Z = sb.length();
                c = 0;
            } else {
                i4 = i10;
                while (true) {
                    if (i4 < 0) {
                        break;
                    }
                    if (i4 < charSequence2.length()) {
                        char charAt4 = charSequence2.charAt(i4);
                        if (i4 != 0) {
                            int i17 = i4 - 1;
                            if (charSequence2.charAt(i17) != ' ') {
                                if (charSequence2.charAt(i17) != '\n') {
                                }
                            }
                        }
                        if (charAt4 == '@') {
                            boolean z10 = this.n0;
                            if (z10 || this.f0 || (this.g0 && i4 == 0)) {
                                break;
                            }
                        } else if (charAt4 == '#') {
                            if (xc2.V(chat4) && !TextUtils.isEmpty(xc2.K(chat4, false))) {
                                String substring2 = charSequence2.substring(i4);
                                this.G = substring2;
                                if (substring2.length() < 4 || !this.G.matches("^[#$][\\p{L}_-]+$")) {
                                    this.G = null;
                                }
                            }
                            sv9 sv9Var = this.x;
                            if (!sv9Var.s) {
                                kf7.a0(sv9Var.m).a.c(new pv9(sv9Var, (byte) 0));
                                this.a0 = charSequence2;
                                this.d0 = i2;
                                this.e0 = arrayList2;
                                return;
                            }
                            this.Y = i4;
                            this.Z = sb.length() + 1;
                            z4 = false;
                            sb.insert(0, charAt4);
                            c = 1;
                        } else if (i4 != 0 || this.X == null || charAt4 != '/') {
                            if (charAt4 == ':' && sb.length() > 0) {
                                if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb.charAt(0)) >= 0) {
                                    i5 = 1;
                                    if (sb.length() > 1) {
                                        break;
                                    }
                                } else {
                                    i5 = 1;
                                    break;
                                }
                            }
                        } else {
                            this.Y = i4;
                            this.Z = sb.length() + 1;
                            c = 2;
                            break;
                        }
                        sb.insert(0, charAt4);
                    }
                    i4--;
                }
            }
            z4 = false;
            i4 = -1;
            ?? r11 = z4;
            String str12 = this.G;
            if (str11 == null) {
                if (str12 != null) {
                    p(r11, 2);
                }
                r5 = this.H;
                if (r5 != 0) {
                    r5.a(r11, str12, chat4);
                }
                p17Var = this.I;
                if (p17Var != null) {
                    p17Var.a(1, this.G, chat4);
                }
            } else {
                if (str12 == null) {
                    q(r11, 2);
                }
                r5 = this.H;
                if (r5 != 0) {
                }
                p17Var = this.I;
                if (p17Var != null) {
                }
            }
            if (c == 65535) {
                this.y0 = r11;
                this.S = null;
                this.W.a(r11);
                return;
            }
            if (c != 0) {
                if (c == 1) {
                    ArrayList arrayList9 = new ArrayList();
                    String lowerCase = sb.toString().toLowerCase();
                    ArrayList arrayList10 = this.x.q;
                    for (int i18 = 0; i18 < arrayList10.size(); i18++) {
                        qv9 qv9Var = (qv9) arrayList10.get(i18);
                        if (qv9Var != null && (str6 = qv9Var.a) != null && str6.startsWith(lowerCase)) {
                            arrayList9.add(qv9Var.a);
                        }
                    }
                    this.J = arrayList9;
                    this.B0 = null;
                    this.y = null;
                    this.E = null;
                    this.N = null;
                    this.K = null;
                    this.R = null;
                    this.L = null;
                    this.Q = null;
                    this.O = null;
                    this.y0 = false;
                    this.S = null;
                    f();
                    this.W.a((this.J.isEmpty() && this.G == null) ? false : true);
                    return;
                }
                if (c != 2) {
                    if (c == 3) {
                        String[] F0 = hl.F0();
                        if (!Arrays.equals(F0, this.P)) {
                            ls6.d0(this.f).O(F0, false);
                        }
                        this.P = F0;
                        ls6.d0(this.f).W(this.P, sb.toString(), false, new g17(this), xea.E && yac.h(this.f).p());
                        return;
                    }
                    if (c == 4) {
                        this.J = null;
                        this.y = null;
                        this.E = null;
                        this.O = null;
                        this.K = null;
                        this.R = null;
                        this.N = null;
                        this.L = null;
                        this.Q = null;
                        return;
                    }
                    return;
                }
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = new ArrayList();
                String lowerCase2 = sb.toString().toLowerCase();
                for (int i19 = 0; i19 < this.X.m(); i19++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.X.n(i19);
                    for (int i20 = 0; i20 < botInfo.commands.size(); i20++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i20);
                        if (botCommand != null && (str5 = botCommand.command) != null && str5.startsWith(lowerCase2)) {
                            arrayList11.add("/" + botCommand.command);
                            arrayList12.add(botCommand.description);
                            arrayList13.add(s1.X1(Long.valueOf(botInfo.user_id)));
                            arrayList14.add(Boolean.valueOf(botCommand.ephemeral));
                        }
                    }
                }
                if (this.H0 != null && !wf3.B(this.n)) {
                    zu1 zu1Var3 = this.H0;
                    if (zu1Var3.g4 == 0 && zu1Var3.h() != null && !this.H0.h().bot && !lbc.B(this.H0.h()) && !lbc.C(this.H0.h().id)) {
                        b19 f = b19.f(this.f);
                        f.h();
                        this.M = lowerCase2;
                        this.N = new ArrayList();
                        for (int i21 = 0; i21 < f.b.size(); i21++) {
                            a19 a19Var = (a19) f.b.get(i21);
                            if (!b19.g(a19Var.b)) {
                                String lowerCase3 = a19Var.b.toLowerCase();
                                if (lowerCase3.startsWith(lowerCase2) || hl.I3(lowerCase3).startsWith(lowerCase2)) {
                                    this.N.add(a19Var);
                                }
                            }
                        }
                        r6 = 0;
                        this.J = r6;
                        this.B0 = r6;
                        this.y = r6;
                        this.E = r6;
                        this.O = r6;
                        this.K = arrayList11;
                        this.L = arrayList12;
                        this.Q = arrayList13;
                        this.R = arrayList14;
                        this.y0 = false;
                        this.S = r6;
                        f();
                        this.W.a(arrayList11.isEmpty() || !((arrayList3 = this.N) == null || arrayList3.isEmpty()));
                        return;
                    }
                }
                r6 = 0;
                this.M = null;
                this.N = null;
                this.J = r6;
                this.B0 = r6;
                this.y = r6;
                this.E = r6;
                this.O = r6;
                this.K = arrayList11;
                this.L = arrayList12;
                this.Q = arrayList13;
                this.R = arrayList14;
                this.y0 = false;
                this.S = r6;
                f();
                this.W.a(arrayList11.isEmpty() || !((arrayList3 = this.N) == null || arrayList3.isEmpty()));
                return;
            }
            this.y0 = r11;
            this.S = null;
            ArrayList arrayList15 = new ArrayList();
            if (arrayList2 != null) {
                for (int i22 = 0; i22 < Math.min(100, arrayList2.size()); i22++) {
                    long Z0 = ((r47) arrayList2.get(i22)).Z0();
                    if (Z0 > 0 && !arrayList15.contains(Long.valueOf(Z0))) {
                        arrayList15.add(Long.valueOf(Z0));
                    }
                }
            }
            String lowerCase4 = sb.toString().toLowerCase();
            boolean z11 = lowerCase4.indexOf(32) >= 0;
            ArrayList arrayList16 = new ArrayList();
            zh6 zh6Var = new zh6();
            zh6 zh6Var2 = new zh6();
            ArrayList arrayList17 = new ArrayList();
            arrayList17.addAll(ls6.d0(this.f).k1);
            if (chat4 == null || (!xc2.p0(chat4) && !xc2.V(chat4))) {
                arrayList17.addAll(ls6.d0(this.f).l1);
            }
            List.-EL.sort(arrayList17, new vk6((byte) 9));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int size2 = arrayList17.size();
            int i23 = 0;
            while (i23 < size2) {
                Object obj = arrayList17.get(i23);
                i23++;
                TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
                Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(wf3.n(tL_topPeer.peer)), tL_topPeer);
            }
            ArrayList arrayList18 = new ArrayList(linkedHashMap.values());
            if (!z && this.g0 && i4 == 0 && !arrayList18.isEmpty()) {
                int i24 = 0;
                for (int i25 = 0; i25 < arrayList18.size(); i25++) {
                    TLRPC.User X1 = s1.X1(Long.valueOf(((TLRPC.TL_topPeer) arrayList18.get(i25)).peer.user_id));
                    if (X1 != null) {
                        String p2 = lbc.p(X1);
                        if (!TextUtils.isEmpty(p2) && (lowerCase4.length() == 0 || p2.toLowerCase().startsWith(lowerCase4))) {
                            arrayList16.add(X1);
                            zh6Var.k(X1.id, X1);
                            zh6Var2.k(X1.id, X1);
                            i24++;
                        }
                        if (i24 == 5) {
                            break;
                        }
                    }
                }
            }
            zu1 zu1Var4 = this.H0;
            if (zu1Var4 != null) {
                chat4 = zu1Var4.e;
                j = zu1Var4.s4;
            } else {
                TLRPC.ChatFull chatFull2 = this.w;
                if (chatFull2 != null) {
                    chat4 = s1.M0(Long.valueOf(chatFull2.id));
                }
                j = 0;
            }
            ?? f2 = yac.h(this.f).f();
            if (chat4 != null && (chatFull = this.w) != null && chatFull.participants != null && (!xc2.T(chat4) || chat4.megagroup)) {
                int i26 = -2;
                int i27 = -2;
                while (i27 < this.w.participants.participants.size()) {
                    if (i27 != i26) {
                        i6 = i27;
                        if (i6 == -1) {
                            if (z2) {
                                if (lowerCase4.length() == 0) {
                                    arrayList16.add(chat4);
                                } else {
                                    String str13 = chat4.title;
                                    p = xc2.K(chat4, false);
                                    j2 = j;
                                    chat2 = chat4;
                                    chat = f2;
                                    j3 = -chat4.id;
                                    str7 = str13;
                                    str8 = null;
                                    if (TextUtils.isEmpty(p)) {
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!z5) {
                                    }
                                }
                            }
                            z5 = z11;
                            j2 = j;
                            chat = f2;
                        } else {
                            TLRPC.ChatParticipant chatParticipant = this.w.participants.participants.get(i6);
                            if (f2 != null) {
                                j2 = j;
                            } else {
                                j2 = j;
                            }
                            ?? X12 = s1.X1(Long.valueOf(chatParticipant.user_id));
                            if (X12 != 0 && !lbc.D(X12) && zh6Var.h(X12.id) < 0) {
                                if (lowerCase4.length() != 0 || X12.deleted) {
                                    str7 = X12.first_name;
                                    String str14 = X12.last_name;
                                    p = lbc.p(X12);
                                    str8 = str14;
                                    chat = f2;
                                    j3 = X12.id;
                                    chat2 = X12;
                                    if (TextUtils.isEmpty(p)) {
                                    }
                                    if (!TextUtils.isEmpty(str7)) {
                                    }
                                    if (!TextUtils.isEmpty(str8)) {
                                    }
                                    if (!z5) {
                                    }
                                } else {
                                    arrayList16.add(X12);
                                }
                            }
                            z5 = z11;
                            chat = f2;
                        }
                    } else if (f2 == null || !z) {
                        z5 = z11;
                        j2 = j;
                        i6 = i27;
                        chat = f2;
                    } else {
                        str7 = f2.first_name;
                        str8 = f2.last_name;
                        p = lbc.p(f2);
                        j2 = j;
                        TLRPC.Chat chat5 = f2;
                        j3 = f2.id;
                        i6 = i27;
                        chat = chat5;
                        chat2 = chat5;
                        if (TextUtils.isEmpty(p)) {
                            z5 = z11;
                        } else {
                            z5 = z11;
                        }
                        if (!TextUtils.isEmpty(str7)) {
                        }
                        if (!TextUtils.isEmpty(str8)) {
                        }
                        if (!z5) {
                            if (lv2.m(0, str7, str8).toLowerCase().startsWith(lowerCase4)) {
                            }
                            arrayList16.add(chat2);
                            zh6Var2.k(j3, chat2);
                        }
                    }
                    int i28 = i6 + 1;
                    j = j2;
                    f2 = chat;
                    i26 = -2;
                    i27 = i28;
                    z11 = z5;
                }
            }
            boolean z12 = z11;
            long j4 = j;
            if (this.n0) {
                ArrayList arrayList19 = uc7.s1(this.f).y;
                for (int i29 = 0; i29 < arrayList19.size(); i29++) {
                    if (((TLRPC.Dialog) arrayList19.get(i29)).id > 0) {
                        TLRPC.User X13 = s1.X1(Long.valueOf(((TLRPC.Dialog) arrayList19.get(i29)).id));
                        if (X13 != null && !lbc.D(X13) && zh6Var.h(X13.id) < 0) {
                            if (lowerCase4.length() != 0 || X13.deleted) {
                                String str15 = X13.first_name;
                                String str16 = X13.last_name;
                                String p3 = lbc.p(X13);
                                long j5 = X13.id;
                                if ((!TextUtils.isEmpty(p3) && p3.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str15) && str15.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || (z12 && lv2.m(0, str15, str16).toLowerCase().startsWith(lowerCase4))))) {
                                    arrayList16.add(X13);
                                    zh6Var2.k(j5, X13);
                                }
                            } else {
                                arrayList16.add(X13);
                            }
                        }
                    } else if (!TextUtils.isEmpty(lowerCase4) && (M0 = s1.M0(Long.valueOf(-((TLRPC.Dialog) arrayList19.get(i29)).id))) != null && M0.username != null && zh6Var.h(M0.id) < 0) {
                        if (lowerCase4.length() == 0) {
                            arrayList16.add(M0);
                        } else {
                            String str17 = M0.title;
                            String str18 = M0.username;
                            long j6 = M0.id;
                            if ((!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4))) {
                                arrayList16.add(M0);
                                zh6Var2.k(j6, M0);
                            }
                        }
                    }
                }
            }
            Collections.sort(arrayList16, new m17(zh6Var2, arrayList15));
            this.J = null;
            this.B0 = null;
            this.N = null;
            this.K = null;
            this.R = null;
            this.L = null;
            this.Q = null;
            this.O = null;
            if (((chat4 == null || !chat4.megagroup) && !this.n0) || lowerCase4.length() <= 0) {
                W(zh6Var2, arrayList16, true);
                return;
            }
            if (arrayList16.size() < 5) {
                yg6 yg6Var2 = new yg6(this, arrayList16, zh6Var2, (byte) 16);
                this.q0 = yg6Var2;
                hl.d3(yg6Var2, 1000L);
            } else {
                W(zh6Var2, arrayList16, true);
            }
            n17 n17Var2 = new n17(this, chat4, lowerCase4, j4, arrayList16, zh6Var2, s1);
            this.F = n17Var2;
            hl.d3(n17Var2, 200L);
        }
    }

    public final void V(TLRPC.ChatFull chatFull) {
        zu1 zu1Var;
        TLRPC.Chat chat;
        this.f = yac.t0;
        this.w = chatFull;
        if (!this.i0 && this.x0 != null && (zu1Var = this.H0) != null && (chat = zu1Var.e) != null) {
            boolean t = xc2.t(chat);
            this.i0 = t;
            if (t) {
                this.y = null;
                f();
                this.W.a(false);
                R(this.x0);
            }
        }
        String str = this.a0;
        if (str != null) {
            U(str, this.d0, this.e0, this.c0, this.b0);
        }
    }

    public final void W(zh6 zh6Var, ArrayList arrayList, boolean z) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || lbc.C(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.E = zh6Var;
        yg6 yg6Var = this.q0;
        if (yg6Var != null) {
            hl.r(yg6Var);
            this.q0 = null;
        }
        this.S = null;
        this.B0 = null;
        if (z) {
            f();
            this.W.a(!this.y.isEmpty());
        }
    }

    @Override // j79
    public final int b() {
        int K = K();
        this.N0 = K;
        return K;
    }

    @Override // j79
    public final int d(int i) {
        if (this.G != null) {
            if (i < 2) {
                return 6;
            }
            i -= 2;
        }
        if (this.B0 != null) {
            return 4;
        }
        if (this.x0 != null && !this.i0) {
            return 3;
        }
        if (this.S == null) {
            ArrayList arrayList = this.N;
            return (arrayList == null || i < 0 || i >= arrayList.size()) ? 0 : 5;
        }
        if (i == 0) {
            return (this.U == null && this.V == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        nr6 nr6Var;
        if (i == jn7.Y1 || i == jn7.Z1) {
            ArrayList arrayList = this.B0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.D0;
            if (arrayList2.isEmpty() || !this.p0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.W.a(K() > 0);
                return;
            }
            return;
        }
        if (i == jn7.X0) {
            nr6 nr6Var2 = this.G0;
            if (nr6Var2 != null) {
                hl.c3(nr6Var2);
                this.G0 = null;
                return;
            }
            return;
        }
        if (i == jn7.x0 && ((Integer) objArr[0]).intValue() == 0 && (nr6Var = this.G0) != null) {
            hl.c3(nr6Var);
            this.G0 = null;
        }
    }

    @Override // j79
    public final void f() {
        hs6 hs6Var;
        String str;
        String str2;
        int i = this.N0;
        w17 w17Var = this.W;
        int i2 = 0;
        if (i != -1 && this.L0 != null) {
            int K = K();
            this.N0 = K;
            boolean z = i != K;
            int min = Math.min(i, K);
            Object[] objArr = new Object[K];
            for (int i3 = 0; i3 < K; i3++) {
                objArr[i3] = J(i3);
            }
            while (i2 < min) {
                if (i2 >= 0) {
                    Object[] objArr2 = this.L0;
                    if (i2 < objArr2.length && i2 < K) {
                        Object obj = objArr2[i2];
                        Object obj2 = objArr[i2];
                        if (!(obj instanceof a19)) {
                            if (obj != obj2 && ((!(obj instanceof q17) || !(obj2 instanceof q17) || ((q17) obj).a != ((q17) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof hs6) && (obj2 instanceof hs6) && (str = (hs6Var = (hs6) obj).b) != null) {
                                    hs6 hs6Var2 = (hs6) obj2;
                                    if (str.equals(hs6Var2.b) && (str2 = hs6Var.a) != null && str2.equals(hs6Var2.a)) {
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                }
                g(i2);
                z = true;
                i2++;
            }
            q(min, i - min);
            p(min, K - min);
            if (z && w17Var != null) {
                w17Var.c();
            }
            this.L0 = objArr;
            return;
        }
        if (w17Var != null) {
            this.N0 = K();
            w17Var.c();
        }
        super.f();
        int K2 = K();
        this.N0 = K2;
        this.L0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.L0;
            if (i2 >= objArr3.length) {
                return;
            }
            objArr3[i2] = J(i2);
            i2++;
        }
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        zu1 zu1Var;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f;
        String str = this.G;
        int i2 = str != null ? i - 2 : i;
        int i3 = f89Var.f;
        View view = f89Var.a;
        if (i3 == 4) {
            u2b u2bVar = (u2b) view;
            if (i2 < 0 || i2 >= this.B0.size()) {
                return;
            }
            q17 q17Var = (q17) this.B0.get(i2);
            TLRPC.Document document = q17Var.a;
            Object obj = q17Var.b;
            cl8 cl8Var = u2bVar.n;
            de0 de0Var = u2bVar.a;
            u2bVar.c = obj;
            boolean W3 = r47.W3(document);
            u2bVar.s = W3;
            if (W3) {
                cl8Var.setColor(aob.w0(null, aob.d6, false));
                cl8Var.I = true;
                cl8Var.J = false;
                cl8Var.invalidate();
            }
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
            ggb f2 = lp3.f(document, aob.a7, 1.0f, u2bVar.w);
            if (!r47.p(document)) {
                f = 1.0f;
                if (f2 == null) {
                    de0Var.n(jn5.c(w, document), null, "webp", null, u2bVar.c);
                } else if (w != null) {
                    de0Var.n(jn5.c(w, document), null, "webp", f2, u2bVar.c);
                } else {
                    de0Var.n(jn5.b(document), null, "webp", f2, u2bVar.c);
                }
            } else if (f2 != null) {
                de0Var.n(jn5.b(document), "80_80", null, f2, u2bVar.c);
                f = 1.0f;
            } else if (w != null) {
                f = 1.0f;
                de0Var.h(jn5.b(document), "80_80", jn5.c(w, document), null, 0, u2bVar.c);
            } else {
                f = 1.0f;
                de0Var.n(jn5.b(document), "80_80", null, null, u2bVar.c);
            }
            u2bVar.b = document;
            Drawable background = u2bVar.getBackground();
            if (background != null) {
                background.setAlpha(230);
                yob.x(u2bVar, background, aob.tf, null, PorterDuff.Mode.MULTIPLY);
            }
            if (u2bVar.s) {
                u2bVar.r = true;
            } else {
                u2bVar.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cl8Var.getLayoutParams();
            if (yac.h(yac.t0).p()) {
                int L = hl.L(16.0f);
                layoutParams.width = L;
                layoutParams.height = L;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = hl.L(8.0f);
                layoutParams.rightMargin = hl.L(8.0f);
                cl8Var.setPadding(hl.L(f), hl.L(f), hl.L(f), hl.L(f));
            } else {
                int L2 = hl.L(24.0f);
                layoutParams.width = L2;
                layoutParams.height = L2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
            }
            cl8Var.setLocked(!yac.h(yac.t0).p());
            hl.T3(cl8Var, u2bVar.r, 0.9f, true, false);
            u2bVar.invalidate();
            u2bVar.setClearsInputField(true);
            return;
        }
        if (i3 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.H0.e;
            if (chat != null) {
                if (!xc2.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(ob6.M0(2131749315, null));
                    return;
                } else if (hl.B1(chat.banned_rights)) {
                    textView.setText(ob6.M0(2131753960, null));
                    return;
                } else {
                    textView.setText(ob6.a0("AttachInlineRestricted", null, 2131753961, ob6.v(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i3 == 5) {
            w09 w09Var = (w09) view;
            ArrayList arrayList = this.N;
            if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                return;
            }
            w09Var.a((a19) this.N.get(i2), this.M, false);
            return;
        }
        ArrayList arrayList2 = this.S;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.U;
            boolean z = (tL_inlineBotSwitchPM == null && this.V == null) ? false : true;
            if (i3 == 2) {
                if (z) {
                    ((pt0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.V.text);
                    return;
                }
                return;
            } else {
                if (z) {
                    i2--;
                }
                if (i2 < 0 || i2 >= arrayList2.size()) {
                    return;
                }
                ((vw2) view).e((TLRPC.BotInlineResult) this.S.get(i2), this.x0, this.y0, i2 != this.S.size() - 1, z && i2 == 0, "gif".equals(this.r0));
                return;
            }
        }
        if (i3 == 6) {
            p17 p17Var = (p17) view;
            int i4 = i2 + 2;
            if (i4 == 0) {
                this.H = p17Var;
            } else {
                this.I = p17Var;
            }
            TLRPC.Chat chat2 = this.m0;
            if (chat2 == null && (zu1Var = this.H0) != null) {
                chat2 = zu1Var.e;
            }
            p17Var.a(i4, str, chat2);
            return;
        }
        if (i3 == 7) {
            return;
        }
        f17 f17Var = (f17) view;
        ArrayList arrayList3 = this.y;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i2);
            if (tLObject instanceof TLRPC.User) {
                f17Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                f17Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.J;
            if (arrayList4 == null || i2 < 0 || i2 >= arrayList4.size()) {
                ArrayList arrayList5 = this.O;
                if (arrayList5 == null || i2 < 0 || i2 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.K;
                    if (arrayList6 != null && i2 >= 0 && i2 < arrayList6.size()) {
                        ArrayList arrayList7 = this.L;
                        String str2 = (arrayList7 == null || i2 < 0 || i2 >= arrayList7.size()) ? null : (String) this.L.get(i2);
                        ArrayList arrayList8 = this.Q;
                        TLRPC.User user = (arrayList8 == null || i2 < 0 || i2 >= arrayList8.size()) ? null : (TLRPC.User) this.Q.get(i2);
                        ArrayList arrayList9 = this.R;
                        boolean booleanValue = ((arrayList9 == null || i2 < 0 || i2 >= arrayList9.size()) ? null : (Boolean) this.R.get(i2)).booleanValue();
                        String str3 = (String) this.K.get(i2);
                        xb xbVar = f17Var.b;
                        TextView textView2 = f17Var.c;
                        rb0 rb0Var = f17Var.d;
                        f17Var.a();
                        de0 de0Var2 = f17Var.a;
                        if (user != null) {
                            de0Var2.setVisibility(0);
                            rb0Var.q(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                de0Var2.setImageDrawable(rb0Var);
                            } else {
                                de0Var2.f(user, rb0Var);
                            }
                        } else {
                            de0Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            wm2 wm2Var = new wm2(R.drawable.mini_ephemeral_hidden_14, 0);
                            wm2Var.a(aob.A6);
                            wm2Var.n = 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(wm2Var, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            xbVar.setText(spannableStringBuilder);
                        } else {
                            xbVar.setText(str3);
                        }
                        textView2.setText(pv3.m(str2, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                } else {
                    f17Var.setEmojiSuggestion((hs6) this.O.get(i2));
                }
            } else {
                f17Var.setText((String) this.J.get(i2));
            }
        }
        f17Var.setDivider(false);
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        vnb vnbVar = this.I0;
        Context context = this.h;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    pt0 pt0Var = new pt0(context);
                    TextView textView = new TextView(context);
                    pt0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    yob.X(textView, aob.uf, null);
                    textView.setTypeface(hl.o());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(ob6.a0 ? 5 : 3);
                    pt0Var.addView(textView, tre.d(-2, -2.0f, (ob6.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view = pt0Var;
                } else if (i == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(hl.L(8.0f), hl.L(8.0f), hl.L(8.0f), hl.L(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    yob.X(textView2, aob.z6, vnbVar);
                    view = textView2;
                } else if (i != 5) {
                    boolean z = this.s;
                    if (i == 6) {
                        view2 = new p17(vnbVar, context, z);
                    } else if (i != 7) {
                        u2b u2bVar = new u2b(context);
                        u2bVar.w = vnbVar;
                        de0 de0Var = new de0(context);
                        u2bVar.a = de0Var;
                        de0Var.setAspectFit(true);
                        de0Var.setLayerNum(1);
                        u2bVar.addView(de0Var, tre.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        u2bVar.setFocusable(true);
                        cl8 cl8Var = new cl8(1, null, context);
                        u2bVar.n = cl8Var;
                        cl8Var.setPadding(hl.L(4.0f), hl.L(4.0f), hl.L(4.0f), hl.L(4.0f));
                        cl8Var.setImageReceiver(de0Var.getImageReceiver());
                        u2bVar.addView(cl8Var, tre.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view = u2bVar;
                    } else {
                        View t62Var = new t62(context, (byte) 13);
                        ColorDrawable colorDrawable = new ColorDrawable(z ? aob.p1(0.15f, -1) : aob.v0(aob.a7, vnbVar));
                        if (!z) {
                            yob.x(t62Var, colorDrawable, aob.a7, vnbVar, PorterDuff.Mode.SRC_IN);
                        }
                        zm2 zm2Var = new zm2(colorDrawable, aob.V0(context, R.drawable.greydivider, aob.v0(aob.b7, vnbVar)), 0, 0);
                        zm2Var.x = true;
                        t62Var.setBackground(zm2Var);
                        view = t62Var;
                    }
                } else {
                    view = new w09(vnbVar, context, false);
                }
            } else {
                vw2 vw2Var = new vw2(context);
                vw2Var.setDelegate(new g17(this));
                view2 = vw2Var;
            }
            view = view2;
        } else {
            f17 f17Var = new f17(context, vnbVar);
            f17Var.setIsDarkTheme(false);
            view = f17Var;
        }
        return new n69(view);
    }
}
