package zf;

import ag.h3;
import ag.i3;
import ag.j3;
import ag.y2;
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
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c00;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.hs;
import org.telegram.messenger.i5;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.k6;
import org.telegram.messenger.o5;
import org.telegram.messenger.qi;
import org.telegram.messenger.rh;
import org.telegram.messenger.tz;
import org.telegram.messenger.ui;
import org.telegram.messenger.us;
import org.telegram.messenger.v5;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.ys;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.mw;
import org.telegram.ui.Components.r8;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.t90;
import org.telegram.ui.un;
import rh.h5;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 extends sk0 implements us {
    public ArrayList A0;
    public HashMap B0;
    public a0.h D;
    public String D0;
    public s0 E;
    public int E0;
    public String F;
    public rh F0;
    public v0 G;
    public un G0;
    public v0 H;
    public final p6 H0;
    public ArrayList I;
    public ArrayList J;
    public final xa.n J0;
    public ArrayList K;
    public Object[] K0;
    public String L;
    public ArrayList M;
    public ArrayList N;
    public String[] O;
    public ArrayList P;
    public ArrayList Q;
    public ArrayList R;
    public long S;
    public TLRPC.TL_inlineBotSwitchPM T;
    public TLRPC.TL_inlineBotWebView U;
    public final t90 V;
    public a0.h W;
    public int X;
    public int Y;
    public String Z;
    public boolean a0;
    public boolean b0;
    public int c0;
    public ArrayList d0;
    public int g0;
    public final Context h;
    public int i0;
    public int j0;
    public boolean k0;
    public TLRPC.Chat l0;
    public long n;
    public mw n0;
    public boolean o0;
    public k0 p0;
    public String q0;
    public final long r;
    public String r0;
    public final boolean s;
    public String s0;
    public int t0;
    public int u0;
    public boolean v0;
    public TLRPC.ChatFull w;
    public TLRPC.User w0;
    public final m1 x;
    public boolean x0;
    public ArrayList y;
    public p0 y0;
    public Location z0;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public int f = d20.s0;
    public boolean e0 = true;
    public boolean f0 = true;
    public boolean h0 = true;
    public boolean m0 = false;
    public final ArrayList C0 = new ArrayList();
    public final o0 I0 = new o0(this, new n0(this));
    public boolean L0 = false;
    public int M0 = -1;

    public x0(Context context, long j10, long j11, t90 t90Var, p6 p6Var, boolean z10) {
        this.H0 = p6Var;
        this.h = context;
        this.V = t90Var;
        this.n = j10;
        this.s = z10;
        this.r = j11;
        m1 m1Var = new m1(true);
        this.x = m1Var;
        m1Var.a = new vh.e0(this);
        xa.n nVar = (xa.n) new ys(zs.f(this.f), this).b;
        nVar.e(zs.X0);
        nVar.e(zs.x0);
        this.J0 = nVar;
        nVar.e(zs.Y1);
        nVar.e(zs.Z1);
    }

    public static boolean O(TLRPC.Document document, String str) {
        int size = document.attributes.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
            if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                String str2 = documentAttribute.alt;
                if (str2 == null || !str2.contains(str)) {
                    break;
                }
                return true;
            }
            i10++;
        }
        return false;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return (this.w0 == null || this.h0) && this.A0 == null;
    }

    public final void E(TLRPC.Document document, String str) {
        String str2 = document.dc_id + "_" + document.id;
        HashMap hashMap = this.B0;
        if (hashMap == null || !hashMap.containsKey(str2)) {
            if (d20.i(this.f).q() || !jj.X3(document)) {
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new w0(str, document));
                this.B0.put(str2, document);
                mw mwVar = this.n0;
                if (mwVar != null) {
                    mwVar.a();
                }
            }
        }
    }

    public final void F(String str, ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        Object obj = str;
        while (i10 < size) {
            TLRPC.Document document = (TLRPC.Document) arrayList.get(i10);
            String str2 = document.dc_id + "_" + document.id;
            HashMap hashMap = this.B0;
            if ((hashMap == null || !hashMap.containsKey(str2)) && (d20.i(this.f).q() || !jj.X3(document))) {
                int size2 = document.attributes.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size2) {
                        break;
                    }
                    TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i11);
                    if (documentAttribute instanceof TLRPC.TL_documentAttributeSticker) {
                        obj = documentAttribute.stickerset;
                        break;
                    }
                    i11++;
                }
                if (this.A0 == null) {
                    this.A0 = new ArrayList();
                    this.B0 = new HashMap();
                }
                this.A0.add(new w0(obj, document));
                this.B0.put(str2, document);
            }
            i10++;
            obj = obj;
        }
    }

    public final void G() {
        un unVar = this.G0;
        if (unVar == null || unVar.getParentActivity() == null) {
            return;
        }
        if (this.G0.getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.G0.getParentActivity().requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            return;
        }
        TLRPC.User user = this.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        this.I0.B();
    }

    public final void H() {
        if (this.A0 == null) {
            return;
        }
        ArrayList arrayList = this.C0;
        arrayList.clear();
        int min = Math.min(6, this.A0.size());
        for (int i10 = 0; i10 < min; i10++) {
            w0 w0Var = (w0) this.A0.get(i10);
            TLRPC.PhotoSize w9 = b8.w(w0Var.a.thumbs, 90, false, null, false);
            if ((w9 instanceof TLRPC.TL_photoSize) || (w9 instanceof TLRPC.TL_photoSizeProgressive)) {
                b8.G(this.f);
                if (!b8.K(w9, "webp", true, true).exists()) {
                    arrayList.add(b8.r("webp", w9));
                    b8.G(this.f).W(ic.c(w9, w0Var.a), w0Var.b, "webp", 1, 1);
                }
            }
        }
        arrayList.isEmpty();
    }

    public final TLRPC.TL_inlineBotSwitchPM I() {
        TLRPC.User user = this.w0;
        if (user == null || user.id == this.S) {
            return this.T;
        }
        return null;
    }

    public final Object J(int i10) {
        String str;
        TLRPC.User user = null;
        if (this.F != null) {
            if (i10 >= 2) {
                i10 -= 2;
            }
            return null;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null) {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                TLRPC.TL_inlineBotWebView tL_inlineBotWebView = this.U;
                if (tL_inlineBotWebView == null) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
                    if (tL_inlineBotSwitchPM != null) {
                        if (i10 == 0) {
                            return tL_inlineBotSwitchPM;
                        }
                    }
                    if (i10 >= 0 && i10 < arrayList2.size()) {
                        return this.R.get(i10);
                    }
                } else if (i10 == 0) {
                    return tL_inlineBotWebView;
                }
                i10--;
                if (i10 >= 0) {
                    return this.R.get(i10);
                }
            } else {
                ArrayList arrayList3 = this.y;
                if (arrayList3 == null) {
                    ArrayList arrayList4 = this.I;
                    if (arrayList4 == null) {
                        ArrayList arrayList5 = this.N;
                        if (arrayList5 == null) {
                            ArrayList arrayList6 = this.M;
                            if (arrayList6 != null || this.J != null) {
                                if (arrayList6 != null) {
                                    if (i10 >= 0 && i10 < arrayList6.size()) {
                                        return this.M.get(i10);
                                    }
                                    ArrayList arrayList7 = this.M;
                                    if (arrayList7 != null) {
                                        i10 -= arrayList7.size();
                                    }
                                }
                                ArrayList arrayList8 = this.J;
                                if (arrayList8 != null && i10 >= 0 && i10 < arrayList8.size()) {
                                    ArrayList arrayList9 = this.P;
                                    if (arrayList9 == null || (this.g0 == 1 && !(this.w instanceof TLRPC.TL_channelFull))) {
                                        str = (String) this.J.get(i10);
                                    } else if (arrayList9.get(i10) != null) {
                                        user = (TLRPC.User) this.P.get(i10);
                                        str = String.format("%s@%s", this.J.get(i10), user != null ? h20.n(user) : "");
                                    } else {
                                        str = String.format("%s", this.J.get(i10));
                                    }
                                    ArrayList arrayList10 = this.Q;
                                    if (arrayList10 == null || !((Boolean) arrayList10.get(i10)).booleanValue()) {
                                        return str;
                                    }
                                    return new u0(str, user != null ? user.id : 0L);
                                }
                            }
                        } else if (i10 >= 0 && i10 < arrayList5.size()) {
                            return this.N.get(i10);
                        }
                    } else if (i10 >= 0 && i10 < arrayList4.size()) {
                        return this.I.get(i10);
                    }
                } else if (i10 >= 0 && i10 < arrayList3.size()) {
                    return this.y.get(i10);
                }
            }
        } else if (i10 >= 0 && i10 < arrayList.size()) {
            return ((w0) this.A0.get(i10)).a;
        }
        return null;
    }

    public final int K() {
        int size;
        int i10 = 1;
        if (this.w0 != null && !this.h0) {
            return 1;
        }
        int i11 = this.F != null ? 2 : 0;
        ArrayList arrayList = this.A0;
        if (arrayList != null) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = this.R;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                if (this.T == null && this.U == null) {
                    i10 = 0;
                }
                return size2 + i10 + i11;
            }
            ArrayList arrayList3 = this.y;
            if (arrayList3 != null) {
                size = arrayList3.size();
            } else {
                ArrayList arrayList4 = this.I;
                if (arrayList4 != null) {
                    size = arrayList4.size();
                } else if (this.J == null && this.M == null) {
                    ArrayList arrayList5 = this.N;
                    if (arrayList5 == null) {
                        return i11;
                    }
                    size = arrayList5.size();
                } else {
                    ArrayList arrayList6 = this.M;
                    int size3 = arrayList6 == null ? 0 : arrayList6.size();
                    ArrayList arrayList7 = this.J;
                    size = size3 + (arrayList7 != null ? arrayList7.size() : 0);
                }
            }
        }
        return size + i11;
    }

    public final Object L(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return null;
            }
            i10 -= 2;
        }
        ArrayList arrayList = this.A0;
        if (arrayList == null || i10 < 0 || i10 >= arrayList.size()) {
            return null;
        }
        return ((w0) this.A0.get(i10)).b;
    }

    public final int M(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 0;
            }
            i10 -= 2;
        }
        return this.R != null ? (this.T == null && this.U == null) ? i10 : i10 - 1 : i10;
    }

    public final boolean N() {
        return this.A0 != null;
    }

    public final void P() {
        o0 o0Var = this.I0;
        if (o0Var != null) {
            o0Var.D();
        }
        p0 p0Var = this.y0;
        if (p0Var != null) {
            org.telegram.messenger.i0.r(p0Var);
            this.y0 = null;
        }
        if (this.t0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.t0, true);
            this.t0 = 0;
        }
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        this.w0 = null;
        this.T = null;
        this.h0 = true;
        this.q0 = null;
        this.r0 = null;
        this.v0 = false;
        this.J0.a();
    }

    public final void Q() {
        TLRPC.User user = this.w0;
        if (user == null || !user.bot_inline_geo) {
            return;
        }
        Location location = new Location("network");
        this.z0 = location;
        location.setLatitude(-1000.0d);
        this.z0.setLongitude(-1000.0d);
        T(true, this.w0, this.r0, "");
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [boolean[], java.io.Serializable, java.lang.Object] */
    public final void R(TLRPC.User user) {
        un unVar;
        TLRPC.Chat chat;
        this.t0 = 0;
        this.I0.D();
        t90 t90Var = this.V;
        if (user == null || !user.bot || user.bot_inline_placeholder == null) {
            this.w0 = null;
            this.T = null;
            this.h0 = true;
        } else {
            this.w0 = user;
            long j10 = user.id;
            if (j10 != this.S) {
                this.T = null;
                this.S = j10;
            }
            un unVar2 = this.G0;
            if (unVar2 != null && (chat = unVar2.e) != null) {
                boolean t10 = w3.t(chat);
                this.h0 = t10;
                if (!t10) {
                    f();
                    t90Var.a(true);
                    return;
                }
            }
            if (this.w0.bot_inline_geo) {
                if (vp.r1(this.f).e7.getBoolean("inlinegeo_" + this.w0.id, false) || (unVar = this.G0) == null || unVar.getParentActivity() == null) {
                    G();
                } else {
                    TLRPC.User user2 = this.w0;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.G0.getParentActivity());
                    String L0 = cd.L0(2131745441, null);
                    x1 x1Var = alertDialog$Builder.a;
                    x1Var.R = L0;
                    x1Var.T = cd.L0(2131745442, null);
                    ?? r42 = new boolean[1];
                    alertDialog$Builder.k(cd.L0(2131747847, null), new q5.a(this, (Object) r42, user2, 14));
                    alertDialog$Builder.h(cd.L0(2131752589, null), new j0(this, r42));
                    this.G0.showDialog(x1Var, new mg.g(18, this, r42));
                }
            }
        }
        if (this.w0 == null) {
            this.v0 = true;
            this.T = null;
        } else {
            if (t90Var != null) {
                t90Var.b(true);
            }
            T(true, this.w0, this.r0, "");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0087, code lost:
    
        if (r8.length() != 0) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(String str, String str2) {
        String str3;
        String str4;
        String str5;
        TLRPC.User user = this.w0;
        if (user == null || (str4 = user.username) == null || !str4.equals(str) || (str5 = this.r0) == null || !str5.equals(str2)) {
            TLRPC.User user2 = this.w0;
            t90 t90Var = this.V;
            if (user2 != null) {
                if (!this.h0 && str != null && str2 != null) {
                    return;
                } else {
                    t90Var.a(false);
                }
            }
            p0 p0Var = this.y0;
            if (p0Var != null) {
                org.telegram.messenger.i0.r(p0Var);
                this.y0 = null;
            }
            if (TextUtils.isEmpty(str) || ((str3 = this.q0) != null && !str3.equals(str))) {
                if (this.t0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.t0, true);
                    this.t0 = 0;
                }
                if (this.u0 != 0) {
                    ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                    this.u0 = 0;
                }
                this.w0 = null;
                this.T = null;
                this.h0 = true;
                this.q0 = null;
                this.r0 = null;
                this.I0.D();
                this.v0 = false;
                if (t90Var != null) {
                    t90Var.b(false);
                }
                if (str != null) {
                }
            }
            if (str2 != null) {
                if (t90Var != null) {
                    if (this.w0 != null) {
                        t90Var.b(true);
                    } else if (str.equals("gif")) {
                        this.q0 = "gif";
                        t90Var.b(false);
                    }
                }
                vp r12 = vp.r1(this.f);
                hs a02 = hs.a0(this.f);
                this.r0 = str2;
                p0 p0Var2 = new p0(this, str2, str, r12, a02);
                this.y0 = p0Var2;
                org.telegram.messenger.i0.h3(p0Var2, 400L);
                return;
            }
            if (this.u0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
                this.u0 = 0;
            }
            this.r0 = null;
            if (t90Var != null) {
                t90Var.b(false);
            }
        }
    }

    public final void T(final boolean z10, final TLRPC.User user, final String str, final String str2) {
        Location location;
        if (this.u0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.u0, true);
            this.u0 = 0;
        }
        if (!this.h0 || !this.d) {
            t90 t90Var = this.V;
            if (t90Var != null) {
                t90Var.b(false);
                return;
            }
            return;
        }
        if (str == null || user == null) {
            this.r0 = null;
            return;
        }
        if (user.bot_inline_geo && this.z0 == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(str);
        sb2.append("_");
        sb2.append(str2);
        sb2.append("_");
        sb2.append(this.n);
        sb2.append("_");
        sb2.append(user.id);
        sb2.append("_");
        sb2.append((!user.bot_inline_geo || this.z0.getLatitude() == -1000.0d) ? "" : Double.valueOf(this.z0.getLongitude() + this.z0.getLatitude()));
        final String sb3 = sb2.toString();
        final hs a02 = hs.a0(this.f);
        RequestDelegate requestDelegate = new RequestDelegate() { // from class: zf.m0
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                org.telegram.messenger.i0.g3(new org.telegram.messenger.camera.i(x0.this, str, z10, tLObject, user, str2, a02, sb3));
            }
        };
        long j10 = user.id;
        if (j10 != this.S) {
            this.T = null;
            this.S = j10;
        }
        if (z10) {
            a02.M(sb3, requestDelegate);
            return;
        }
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = vp.r1(this.f).p1(user);
        tL_messages_getInlineBotResults.query = str;
        tL_messages_getInlineBotResults.offset = str2;
        if (user.bot_inline_geo && (location = this.z0) != null && location.getLatitude() != -1000.0d) {
            tL_messages_getInlineBotResults.flags |= 1;
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
            tL_inputGeoPoint.lat = org.telegram.messenger.i0.b0(this.z0.getLatitude());
            tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.i0.b0(this.z0.getLongitude());
        }
        if (o5.C(this.n)) {
            tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
        } else {
            tL_messages_getInlineBotResults.peer = vp.r1(this.f).i1(this.n);
        }
        this.u0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getInlineBotResults, requestDelegate, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:223:0x071c, code lost:
    
        if (r17.toLowerCase().startsWith(r0) == false) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x072f, code lost:
    
        if (r14.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x073f, code lost:
    
        if (r15.toLowerCase().startsWith(r0) != false) goto L418;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x06d0, code lost:
    
        if (r13.user_id == r11.id) goto L386;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x03ec, code lost:
    
        if (r11 != ':') goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0408, code lost:
    
        if (r27.w != null) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x040a, code lost:
    
        if (r13 == 0) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x040c, code lost:
    
        r27.Z = r7;
        r27.c0 = r3;
        r27.d0 = r0;
        r12.a(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0416, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x04bb, code lost:
    
        r27.X = r13;
        r27.Y = r14.length() + r15;
        r15 = 3;
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0467, code lost:
    
        r13 = -1;
        r6 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0758 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:240:0x071f  */
    /* JADX WARN: Type inference failed for: r11v13, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v31, types: [org.telegram.tgnet.TLRPC$User] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r12v0, types: [org.telegram.ui.Components.t90] */
    /* JADX WARN: Type inference failed for: r27v0, types: [java.lang.Object, s4.g0, zf.x0] */
    /* JADX WARN: Type inference failed for: r3v25, types: [zf.v0] */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v48 */
    /* JADX WARN: Type inference failed for: r6v49, types: [a0.h, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v98 */
    /* JADX WARN: Type inference failed for: r6v99 */
    /* JADX WARN: Type inference failed for: r9v31, types: [java.lang.Object, org.telegram.tgnet.TLRPC$User] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(CharSequence charSequence, int i10, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        boolean z12;
        String str2;
        int i11;
        ArrayList arrayList2;
        char c10;
        String str3;
        un unVar;
        char c11;
        int i12;
        String str4;
        String str5;
        boolean z13;
        char c12;
        int i13;
        ?? r62;
        boolean z14;
        ?? r63;
        ArrayList arrayList3;
        String str6;
        String str7;
        long j10;
        TLRPC.Chat L0;
        TLRPC.ChatFull chatFull;
        int i14;
        long j11;
        String str8;
        String n10;
        String str9;
        TLRPC.Chat chat;
        long j12;
        boolean z15;
        TLRPC.Chat chat2;
        ArrayList arrayList4;
        String str10;
        char c13;
        String str11 = "";
        String charSequence2 = charSequence == null ? "" : charSequence.toString();
        TLRPC.Chat chat3 = this.l0;
        un unVar2 = this.G0;
        if (unVar2 != null) {
            chat3 = unVar2.e;
            unVar2.j();
        }
        TLRPC.Chat chat4 = chat3;
        k0 k0Var = this.p0;
        if (k0Var != null) {
            org.telegram.messenger.i0.r(k0Var);
            this.p0 = null;
        }
        if (this.j0 != 0) {
            ConnectionsManager.getInstance(this.f).cancelRequest(this.j0, true);
            this.j0 = 0;
        }
        s0 s0Var = this.E;
        if (s0Var != null) {
            org.telegram.messenger.i0.r(s0Var);
            this.E = null;
        }
        rh rhVar = this.F0;
        if (rhVar != null) {
            org.telegram.messenger.i0.r(rhVar);
            this.F0 = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence2);
        ?? r12 = this.V;
        if (isEmpty || charSequence2.length() > vp.r1(this.f).t1()) {
            S(null, null);
            r12.a(false);
            this.Z = null;
            this.D0 = null;
            this.A0 = null;
            this.B0 = null;
            f();
            this.o0 = false;
            if (this.E0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.E0, true);
                this.E0 = 0;
            }
            mw mwVar = this.n0;
            if (mwVar != null) {
                mwVar.a();
                return;
            }
            return;
        }
        int i15 = charSequence2.length() > 0 ? i10 - 1 : i10;
        this.Z = null;
        this.b0 = z10;
        this.a0 = z11;
        StringBuilder sb2 = new StringBuilder();
        boolean z16 = !z10 && charSequence2.length() > 0 && charSequence2.length() <= 14;
        if (z16) {
            int length = charSequence2.length();
            CharSequence charSequence3 = charSequence2;
            z12 = true;
            int i16 = 0;
            while (i16 < length) {
                char charAt = charSequence3.charAt(i16);
                int i17 = length - 1;
                if (i16 < i17) {
                    str10 = str11;
                    c13 = charSequence3.charAt(i16 + 1);
                } else {
                    str10 = str11;
                    c13 = 0;
                }
                if (i16 < i17 && charAt == 55356 && c13 >= 57339 && c13 <= 57343) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i16), charSequence3.subSequence(i16 + 2, charSequence3.length()));
                    length -= 2;
                } else if (charAt == 65039) {
                    charSequence3 = TextUtils.concat(charSequence3.subSequence(0, i16), charSequence3.subSequence(i16 + 1, charSequence3.length()));
                    length--;
                } else {
                    i16++;
                    str11 = str10;
                }
                i16--;
                i16++;
                str11 = str10;
            }
            str = str11;
            this.D0 = charSequence3.toString().trim();
            str2 = charSequence2;
        } else {
            str = "";
            z12 = true;
            str2 = str;
        }
        boolean z17 = (z16 && (k6.h(str2) || k6.h(this.D0))) ? z12 : false;
        if (z17 && (charSequence instanceof Spanned)) {
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.o5.class);
            z17 = (o5VarArr == null || o5VarArr.length == 0) ? z12 : false;
        }
        if (this.c && z17 && (chat4 == null || w3.t(chat4))) {
            ArrayList arrayList5 = this.C0;
            arrayList5.clear();
            int i18 = tz.E;
            if (i18 == 2 || !z17) {
                if (this.o0 && i18 == 2) {
                    this.o0 = false;
                    r12.a(false);
                    f();
                    return;
                }
                return;
            }
            this.A0 = null;
            this.B0 = null;
            if (this.E0 != 0) {
                ConnectionsManager.getInstance(this.f).cancelRequest(this.E0, z12);
                this.E0 = 0;
            }
            boolean z18 = vp.r1(this.f).c4;
            if (z18) {
                arrayList2 = arrayList;
                arrayList4 = arrayList5;
                i11 = i10;
            } else {
                arrayList4 = arrayList5;
                i11 = i10;
                arrayList2 = arrayList;
                this.F0 = new rh((x0) this, charSequence, i11, arrayList, z10, z11);
                ui.b0(this.f).V0(0, false, true, false);
                ui.b0(this.f).V0(2, false, true, false);
                ArrayList arrayList6 = ui.b0(this.f).f0[0];
                ArrayList arrayList7 = ui.b0(this.f).f0[2];
                int min = Math.min(20, arrayList6.size());
                int i19 = 0;
                for (int i20 = 0; i20 < min; i20++) {
                    TLRPC.Document document = (TLRPC.Document) arrayList6.get(i20);
                    if (O(document, this.D0)) {
                        E(document, "recent");
                        int i21 = i19 + 1;
                        if (i21 >= 5) {
                            break;
                        } else {
                            i19 = i21;
                        }
                    }
                }
                int size = arrayList7.size();
                for (int i22 = 0; i22 < size; i22++) {
                    TLRPC.Document document2 = (TLRPC.Document) arrayList7.get(i22);
                    if (O(document2, this.D0)) {
                        E(document2, "fav");
                    }
                }
                ui.b0(this.f).B(0);
                HashMap hashMap = ui.b0(this.f).d0;
                ArrayList arrayList8 = hashMap != null ? (ArrayList) hashMap.get(this.D0) : null;
                if (arrayList8 != null && !arrayList8.isEmpty()) {
                    F(null, arrayList8);
                }
                ArrayList arrayList9 = this.A0;
                if (arrayList9 != null) {
                    Collections.sort(arrayList9, new q0(arrayList7, arrayList6));
                }
            }
            if (tz.E == 0 || z18) {
                String str12 = this.D0;
                TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                tL_messages_getStickers.emoticon = str2;
                tL_messages_getStickers.hash = 0L;
                this.E0 = ConnectionsManager.getInstance(this.f).sendRequest(tL_messages_getStickers, new h5(12, this, str12));
            }
            ArrayList arrayList10 = this.A0;
            if (arrayList10 != null && !arrayList10.isEmpty()) {
                if (tz.E != 0 || this.A0.size() >= 5) {
                    H();
                    r12.a(arrayList4.isEmpty());
                    this.o0 = true;
                } else {
                    r12.a(false);
                    this.o0 = false;
                }
                f();
            } else if (this.o0) {
                r12.a(false);
                this.o0 = false;
            }
            c10 = ' ';
            c11 = 4;
            str3 = null;
        } else {
            i11 = i10;
            arrayList2 = arrayList;
            if (!z10 && this.f0 && charSequence2.charAt(0) == '@') {
                c10 = ' ';
                int indexOf = charSequence2.indexOf(32);
                int length2 = charSequence2.length();
                if (indexOf > 0) {
                    String substring = charSequence2.substring(1, indexOf);
                    str5 = charSequence2.substring(indexOf + 1);
                    str4 = substring;
                    i12 = 1;
                } else if (charSequence2.charAt(length2 - 1) == 't' && charSequence2.charAt(length2 - 2) == 'o' && charSequence2.charAt(length2 - 3) == 'b') {
                    i12 = 1;
                    str4 = charSequence2.substring(1);
                    str5 = str;
                } else {
                    i12 = 1;
                    S(null, null);
                    str4 = null;
                    str5 = null;
                }
                if (str4 != null && str4.length() >= i12) {
                    for (int i23 = 1; i23 < str4.length(); i23++) {
                        char charAt2 = str4.charAt(i23);
                        if ((charAt2 >= '0' && charAt2 <= '9') || ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || charAt2 == '_'))) {
                        }
                    }
                    S(str4, str5);
                    str3 = null;
                }
                str4 = str;
                S(str4, str5);
                str3 = null;
            } else {
                c10 = ' ';
                if (!this.c || (unVar = this.G0) == null || unVar.h != null || (!(chat4 == null || w3.t(chat4)) || charSequence2.trim().length() < 2 || charSequence2.trim().indexOf(32) >= 0)) {
                    str3 = null;
                    S(null, null);
                } else {
                    str3 = null;
                    S(null, null);
                }
            }
            c11 = 65535;
        }
        if (this.w0 != null) {
            return;
        }
        vp r13 = vp.r1(this.f);
        String str13 = this.F;
        this.F = str3;
        m1 m1Var = this.x;
        if (z10) {
            sb2.append(charSequence2.substring(1));
            this.X = 0;
            this.Y = sb2.length();
            z14 = false;
            i15 = -1;
        } else {
            while (true) {
                if (i15 < 0) {
                    z13 = false;
                    c12 = c11;
                    break;
                }
                if (i15 < charSequence2.length()) {
                    char charAt3 = charSequence2.charAt(i15);
                    if (i15 != 0) {
                        int i24 = i15 - 1;
                        if (charSequence2.charAt(i24) != c10) {
                            if (charSequence2.charAt(i24) != '\n') {
                            }
                        }
                    }
                    if (charAt3 == '@') {
                        boolean z19 = this.m0;
                        if (z19 || this.e0 || (this.f0 && i15 == 0)) {
                            break;
                        }
                    } else if (charAt3 == '#') {
                        if (w3.V(chat4) && !TextUtils.isEmpty(w3.K(chat4, false))) {
                            String substring2 = charSequence2.substring(i15);
                            this.F = substring2;
                            if (substring2.length() < 4 || !this.F.matches("^[#$][\\p{L}_-]+$")) {
                                this.F = null;
                            }
                        }
                        if (!m1Var.s) {
                            hs.a0(m1Var.m).a.c(new j1(m1Var, 1));
                            this.Z = charSequence2;
                            this.c0 = i11;
                            this.d0 = arrayList2;
                            return;
                        }
                        this.X = i15;
                        c12 = 1;
                        this.Y = sb2.length() + 1;
                        sb2.insert(0, charAt3);
                        z13 = false;
                    } else if (i15 != 0 || this.W == null || charAt3 != '/') {
                        if (charAt3 == ':' && sb2.length() > 0) {
                            if (" !\"#$%&'()*+,-./:;<=>?@[\\]^_`{|}~\n".indexOf(sb2.charAt(0)) >= 0) {
                                i13 = 1;
                                if (sb2.length() > 1) {
                                    break;
                                }
                            } else {
                                i13 = 1;
                                break;
                            }
                        }
                    } else {
                        this.X = i15;
                        this.Y = sb2.length() + 1;
                        r62 = 0;
                        i15 = -1;
                        c12 = 2;
                        break;
                    }
                    sb2.insert(0, charAt3);
                }
                i15--;
            }
            this.X = i15;
            this.Y = sb2.length() + 1;
            z14 = false;
        }
        c12 = 0;
        r62 = z14;
        if (str13 == null && this.F != null) {
            o(r62, 2);
        } else if (str13 == null || this.F != null) {
            ?? r32 = this.G;
            if (r32 != 0) {
                r32.a(r62, this.F, chat4);
            }
            v0 v0Var = this.H;
            if (v0Var != null) {
                v0Var.a(1, this.F, chat4);
            }
        } else {
            p(r62, 2);
        }
        if (c12 == 65535) {
            this.x0 = r62;
            this.R = null;
            r12.a(r62);
            return;
        }
        if (c12 != 0) {
            if (c12 == 1) {
                ArrayList arrayList11 = new ArrayList();
                String lowerCase = sb2.toString().toLowerCase();
                ArrayList arrayList12 = m1Var.q;
                for (int i25 = 0; i25 < arrayList12.size(); i25++) {
                    k1 k1Var = (k1) arrayList12.get(i25);
                    if (k1Var != null && (str7 = k1Var.a) != null && str7.startsWith(lowerCase)) {
                        arrayList11.add(k1Var.a);
                    }
                }
                this.I = arrayList11;
                this.A0 = null;
                this.y = null;
                this.D = null;
                this.M = null;
                this.J = null;
                this.Q = null;
                this.K = null;
                this.P = null;
                this.N = null;
                this.x0 = false;
                this.R = null;
                f();
                r12.a((this.I.isEmpty() && this.F == null) ? false : true);
                return;
            }
            if (c12 != 2) {
                if (c12 == 3) {
                    String[] G0 = org.telegram.messenger.i0.G0();
                    if (!Arrays.equals(G0, this.O)) {
                        ui.b0(this.f).M(G0, false);
                    }
                    this.O = G0;
                    ui.b0(this.f).U(this.O, sb2.toString(), false, new l0(this), tz.F && d20.i(this.f).q());
                    return;
                }
                if (c12 == 4) {
                    this.I = null;
                    this.y = null;
                    this.D = null;
                    this.N = null;
                    this.J = null;
                    this.Q = null;
                    this.M = null;
                    this.K = null;
                    this.P = null;
                    return;
                }
                return;
            }
            ArrayList arrayList13 = new ArrayList();
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = new ArrayList();
            ArrayList arrayList16 = new ArrayList();
            String lowerCase2 = sb2.toString().toLowerCase();
            for (int i26 = 0; i26 < this.W.m(); i26++) {
                TL_bots.BotInfo botInfo = (TL_bots.BotInfo) this.W.n(i26);
                for (int i27 = 0; i27 < botInfo.commands.size(); i27++) {
                    TLRPC.BotCommand botCommand = botInfo.commands.get(i27);
                    if (botCommand != null && (str6 = botCommand.command) != null && str6.startsWith(lowerCase2)) {
                        arrayList13.add("/" + botCommand.command);
                        arrayList14.add(botCommand.description);
                        arrayList15.add(r13.Z1(Long.valueOf(botInfo.user_id)));
                        arrayList16.add(Boolean.valueOf(botCommand.ephemeral));
                    }
                }
            }
            if (this.G0 != null && !o5.C(this.n)) {
                un unVar3 = this.G0;
                if (unVar3.f4 == 0 && unVar3.j() != null && !this.G0.j().bot && !h20.z(this.G0.j()) && !h20.A(this.G0.j().id)) {
                    i3 f7 = i3.f(this.f);
                    ArrayList arrayList17 = f7.b;
                    f7.h();
                    this.L = lowerCase2;
                    this.M = new ArrayList();
                    for (int i28 = 0; i28 < arrayList17.size(); i28++) {
                        h3 h3Var = (h3) arrayList17.get(i28);
                        if (!i3.g(h3Var.b)) {
                            String lowerCase3 = h3Var.b.toLowerCase();
                            if (lowerCase3.startsWith(lowerCase2) || org.telegram.messenger.i0.N3(lowerCase3).startsWith(lowerCase2)) {
                                this.M.add(h3Var);
                            }
                        }
                    }
                    r63 = 0;
                    this.I = r63;
                    this.A0 = r63;
                    this.y = r63;
                    this.D = r63;
                    this.N = r63;
                    this.J = arrayList13;
                    this.K = arrayList14;
                    this.P = arrayList15;
                    this.Q = arrayList16;
                    this.x0 = false;
                    this.R = r63;
                    f();
                    r12.a(arrayList13.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
                    return;
                }
            }
            r63 = 0;
            this.L = null;
            this.M = null;
            this.I = r63;
            this.A0 = r63;
            this.y = r63;
            this.D = r63;
            this.N = r63;
            this.J = arrayList13;
            this.K = arrayList14;
            this.P = arrayList15;
            this.Q = arrayList16;
            this.x0 = false;
            this.R = r63;
            f();
            r12.a(arrayList13.isEmpty() || !((arrayList3 = this.M) == null || arrayList3.isEmpty()));
            return;
        }
        this.x0 = r62;
        this.R = null;
        ArrayList arrayList18 = new ArrayList();
        if (arrayList2 != null) {
            for (int i29 = 0; i29 < Math.min(100, arrayList2.size()); i29++) {
                long Z0 = ((jj) arrayList2.get(i29)).Z0();
                if (Z0 > 0 && !arrayList18.contains(Long.valueOf(Z0))) {
                    arrayList18.add(Long.valueOf(Z0));
                }
            }
        }
        String lowerCase4 = sb2.toString().toLowerCase();
        boolean z20 = lowerCase4.indexOf(c10) >= 0;
        ArrayList arrayList19 = new ArrayList();
        a0.h hVar = new a0.h();
        a0.h hVar2 = new a0.h();
        ArrayList arrayList20 = new ArrayList();
        arrayList20.addAll(ui.b0(this.f).j1);
        if (chat4 == null || (!w3.p0(chat4) && !w3.V(chat4))) {
            arrayList20.addAll(ui.b0(this.f).k1);
        }
        List.-EL.sort(arrayList20, new x2.e(10));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size2 = arrayList20.size();
        int i30 = 0;
        while (i30 < size2) {
            Object obj = arrayList20.get(i30);
            i30++;
            TLRPC.TL_topPeer tL_topPeer = (TLRPC.TL_topPeer) obj;
            Map.-EL.putIfAbsent(linkedHashMap, Long.valueOf(o5.o(tL_topPeer.peer)), tL_topPeer);
        }
        ArrayList arrayList21 = new ArrayList(linkedHashMap.values());
        if (!z10 && this.f0 && i15 == 0 && !arrayList21.isEmpty()) {
            int i31 = 0;
            for (int i32 = 0; i32 < arrayList21.size(); i32++) {
                TLRPC.User Z1 = r13.Z1(Long.valueOf(((TLRPC.TL_topPeer) arrayList21.get(i32)).peer.user_id));
                if (Z1 != null) {
                    String n11 = h20.n(Z1);
                    if (!TextUtils.isEmpty(n11) && (lowerCase4.length() == 0 || n11.toLowerCase().startsWith(lowerCase4))) {
                        arrayList19.add(Z1);
                        hVar.k(Z1, Z1.id);
                        hVar2.k(Z1, Z1.id);
                        i31++;
                    }
                    if (i31 == 5) {
                        break;
                    }
                }
            }
        }
        un unVar4 = this.G0;
        if (unVar4 != null) {
            chat4 = unVar4.e;
            j10 = unVar4.r4;
        } else {
            TLRPC.ChatFull chatFull2 = this.w;
            if (chatFull2 != null) {
                chat4 = r13.L0(Long.valueOf(chatFull2.id));
            }
            j10 = 0;
        }
        ?? f10 = d20.i(this.f).f();
        if (chat4 != null && (chatFull = this.w) != null && chatFull.participants != null && (!w3.T(chat4) || chat4.megagroup)) {
            int i33 = -2;
            int i34 = -2;
            while (i34 < this.w.participants.participants.size()) {
                if (i34 != i33) {
                    i14 = i34;
                    if (i14 == -1) {
                        if (z11) {
                            if (lowerCase4.length() == 0) {
                                arrayList19.add(chat4);
                            } else {
                                String str14 = chat4.title;
                                n10 = w3.K(chat4, false);
                                j11 = j10;
                                chat2 = chat4;
                                chat = f10;
                                j12 = -chat4.id;
                                str8 = str14;
                                str9 = null;
                                if (TextUtils.isEmpty(n10)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                if (!z15) {
                                }
                            }
                        }
                        z15 = z20;
                        j11 = j10;
                        chat = f10;
                    } else {
                        TLRPC.ChatParticipant chatParticipant = this.w.participants.participants.get(i14);
                        if (f10 != null) {
                            j11 = j10;
                        } else {
                            j11 = j10;
                        }
                        ?? Z12 = r13.Z1(Long.valueOf(chatParticipant.user_id));
                        if (Z12 != 0 && !h20.B(Z12) && hVar.h(Z12.id) < 0) {
                            if (lowerCase4.length() != 0 || Z12.deleted) {
                                str8 = Z12.first_name;
                                String str15 = Z12.last_name;
                                n10 = h20.n(Z12);
                                str9 = str15;
                                chat = f10;
                                j12 = Z12.id;
                                chat2 = Z12;
                                if (TextUtils.isEmpty(n10)) {
                                }
                                if (!TextUtils.isEmpty(str8)) {
                                }
                                if (!TextUtils.isEmpty(str9)) {
                                }
                                if (!z15) {
                                }
                            } else {
                                arrayList19.add(Z12);
                            }
                        }
                        z15 = z20;
                        chat = f10;
                    }
                } else if (f10 == null || !z10) {
                    z15 = z20;
                    j11 = j10;
                    i14 = i34;
                    chat = f10;
                } else {
                    str8 = f10.first_name;
                    str9 = f10.last_name;
                    n10 = h20.n(f10);
                    j11 = j10;
                    TLRPC.Chat chat5 = f10;
                    j12 = f10.id;
                    i14 = i34;
                    chat = chat5;
                    chat2 = chat5;
                    if (TextUtils.isEmpty(n10)) {
                        z15 = z20;
                    } else {
                        z15 = z20;
                    }
                    if (!TextUtils.isEmpty(str8)) {
                    }
                    if (!TextUtils.isEmpty(str9)) {
                    }
                    if (!z15) {
                        if (i5.m(0, str8, str9).toLowerCase().startsWith(lowerCase4)) {
                        }
                        arrayList19.add(chat2);
                        hVar2.k(chat2, j12);
                    }
                }
                int i35 = i14 + 1;
                j10 = j11;
                f10 = chat;
                i33 = -2;
                i34 = i35;
                z20 = z15;
            }
        }
        boolean z21 = z20;
        long j13 = j10;
        if (this.m0) {
            ArrayList arrayList22 = vp.r1(this.f).y;
            for (int i36 = 0; i36 < arrayList22.size(); i36++) {
                if (((TLRPC.Dialog) arrayList22.get(i36)).id > 0) {
                    TLRPC.User Z13 = r13.Z1(Long.valueOf(((TLRPC.Dialog) arrayList22.get(i36)).id));
                    if (Z13 != null && !h20.B(Z13) && hVar.h(Z13.id) < 0) {
                        if (lowerCase4.length() != 0 || Z13.deleted) {
                            String str16 = Z13.first_name;
                            String str17 = Z13.last_name;
                            String n12 = h20.n(Z13);
                            long j14 = Z13.id;
                            if ((!TextUtils.isEmpty(n12) && n12.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str16) && str16.toLowerCase().startsWith(lowerCase4)) || ((!TextUtils.isEmpty(str17) && str17.toLowerCase().startsWith(lowerCase4)) || (z21 && i5.m(0, str16, str17).toLowerCase().startsWith(lowerCase4))))) {
                                arrayList19.add(Z13);
                                hVar2.k(Z13, j14);
                            }
                        } else {
                            arrayList19.add(Z13);
                        }
                    }
                } else if (!TextUtils.isEmpty(lowerCase4) && (L0 = r13.L0(Long.valueOf(-((TLRPC.Dialog) arrayList22.get(i36)).id))) != null && L0.username != null && hVar.h(L0.id) < 0) {
                    if (lowerCase4.length() == 0) {
                        arrayList19.add(L0);
                    } else {
                        String str18 = L0.title;
                        String str19 = L0.username;
                        long j15 = L0.id;
                        if ((!TextUtils.isEmpty(str19) && str19.toLowerCase().startsWith(lowerCase4)) || (!TextUtils.isEmpty(str18) && str18.toLowerCase().startsWith(lowerCase4))) {
                            arrayList19.add(L0);
                            hVar2.k(L0, j15);
                        }
                    }
                }
            }
        }
        Collections.sort(arrayList19, new r0(hVar2, arrayList18));
        this.I = null;
        this.A0 = null;
        this.M = null;
        this.J = null;
        this.Q = null;
        this.K = null;
        this.P = null;
        this.N = null;
        if (((chat4 == null || !chat4.megagroup) && !this.m0) || lowerCase4.length() <= 0) {
            Y(hVar2, arrayList19, true);
            return;
        }
        if (arrayList19.size() < 5) {
            k0 k0Var2 = new k0(this, arrayList19, hVar2, 0);
            this.p0 = k0Var2;
            org.telegram.messenger.i0.h3(k0Var2, 1000L);
        } else {
            Y(hVar2, arrayList19, true);
        }
        s0 s0Var2 = new s0(this, chat4, lowerCase4, j13, arrayList19, hVar2, r13);
        this.E = s0Var2;
        org.telegram.messenger.i0.h3(s0Var2, 200L);
    }

    public final void V(boolean z10) {
        this.c = z10;
    }

    public final void W(TLRPC.ChatFull chatFull) {
        un unVar;
        TLRPC.Chat chat;
        this.f = d20.s0;
        this.w = chatFull;
        if (!this.h0 && this.w0 != null && (unVar = this.G0) != null && (chat = unVar.e) != null) {
            boolean t10 = w3.t(chat);
            this.h0 = t10;
            if (t10) {
                this.y = null;
                f();
                this.V.a(false);
                R(this.w0);
            }
        }
        String str = this.Z;
        if (str != null) {
            U(str, this.c0, this.d0, this.b0, this.a0);
        }
    }

    public final void X(un unVar) {
        this.G0 = unVar;
    }

    public final void Y(a0.h hVar, ArrayList arrayList, boolean z10) {
        this.y = arrayList;
        if (!this.d || !this.e) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TLObject tLObject = (TLObject) it.next();
                if ((tLObject instanceof TLRPC.Chat) && !this.e) {
                    it.remove();
                } else if (tLObject instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) tLObject;
                    if (user.bot || h20.A(user.id)) {
                        it.remove();
                    }
                }
            }
        }
        this.D = hVar;
        k0 k0Var = this.p0;
        if (k0Var != null) {
            org.telegram.messenger.i0.r(k0Var);
            this.p0 = null;
        }
        this.R = null;
        this.A0 = null;
        if (z10) {
            f();
            this.V.a(!this.y.isEmpty());
        }
    }

    @Override // s4.g0
    public final int b() {
        int K = K();
        this.M0 = K;
        return K;
    }

    @Override // s4.g0
    public final int d(int i10) {
        if (this.F != null) {
            if (i10 < 2) {
                return 6;
            }
            i10 -= 2;
        }
        if (this.A0 != null) {
            return 4;
        }
        if (this.w0 != null && !this.h0) {
            return 3;
        }
        if (this.R == null) {
            ArrayList arrayList = this.M;
            return (arrayList == null || i10 < 0 || i10 >= arrayList.size()) ? 0 : 5;
        }
        if (i10 == 0) {
            return (this.T == null && this.U == null) ? 1 : 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        rh rhVar;
        if (i10 == zs.Y1 || i10 == zs.Z1) {
            ArrayList arrayList = this.A0;
            if (arrayList == null || arrayList.isEmpty()) {
                return;
            }
            ArrayList arrayList2 = this.C0;
            if (arrayList2.isEmpty() || !this.o0) {
                return;
            }
            arrayList2.remove((String) objArr[0]);
            if (arrayList2.isEmpty()) {
                this.V.a(K() > 0);
                return;
            }
            return;
        }
        if (i10 == zs.X0) {
            rh rhVar2 = this.F0;
            if (rhVar2 != null) {
                org.telegram.messenger.i0.g3(rhVar2);
                this.F0 = null;
                return;
            }
            return;
        }
        if (i10 == zs.x0 && ((Integer) objArr[0]).intValue() == 0 && (rhVar = this.F0) != null) {
            org.telegram.messenger.i0.g3(rhVar);
            this.F0 = null;
        }
    }

    @Override // s4.g0
    public final void f() {
        qi qiVar;
        String str;
        String str2;
        int i10 = this.M0;
        t90 t90Var = this.V;
        int i11 = 0;
        if (i10 != -1 && this.K0 != null) {
            int K = K();
            this.M0 = K;
            boolean z10 = i10 != K;
            int min = Math.min(i10, K);
            Object[] objArr = new Object[K];
            for (int i12 = 0; i12 < K; i12++) {
                objArr[i12] = J(i12);
            }
            while (i11 < min) {
                if (i11 >= 0) {
                    Object[] objArr2 = this.K0;
                    if (i11 < objArr2.length && i11 < K) {
                        Object obj = objArr2[i11];
                        Object obj2 = objArr[i11];
                        if (!(obj instanceof h3)) {
                            if (obj != obj2 && ((!(obj instanceof w0) || !(obj2 instanceof w0) || ((w0) obj).a != ((w0) obj2).a) && ((!(obj instanceof TLRPC.User) || !(obj2 instanceof TLRPC.User) || ((TLRPC.User) obj).id != ((TLRPC.User) obj2).id) && ((!(obj instanceof TLRPC.Chat) || !(obj2 instanceof TLRPC.Chat) || ((TLRPC.Chat) obj).id != ((TLRPC.Chat) obj2).id) && (!(obj instanceof String) || !(obj2 instanceof String) || !obj.equals(obj2)))))) {
                                if ((obj instanceof qi) && (obj2 instanceof qi) && (str = (qiVar = (qi) obj).b) != null) {
                                    qi qiVar2 = (qi) obj2;
                                    if (str.equals(qiVar2.b) && (str2 = qiVar.a) != null && str2.equals(qiVar2.a)) {
                                    }
                                }
                            }
                            i11++;
                        }
                    }
                }
                g(i11);
                z10 = true;
                i11++;
            }
            p(min, i10 - min);
            o(min, K - min);
            if (z10 && t90Var != null) {
                t90Var.c();
            }
            this.K0 = objArr;
            return;
        }
        if (t90Var != null) {
            this.M0 = K();
            t90Var.c();
        }
        super.f();
        int K2 = K();
        this.M0 = K2;
        this.K0 = new Object[K2];
        while (true) {
            Object[] objArr3 = this.K0;
            if (i11 >= objArr3.length) {
                return;
            }
            objArr3[i11] = J(i11);
            i11++;
        }
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        un unVar;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        float f7;
        String str = this.F;
        int i11 = str != null ? i10 - 2 : i10;
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 4) {
            org.telegram.ui.Cells.b8 b8Var = (org.telegram.ui.Cells.b8) view;
            if (i11 < 0 || i11 >= this.A0.size()) {
                return;
            }
            w0 w0Var = (w0) this.A0.get(i11);
            TLRPC.Document document = w0Var.a;
            Object obj = w0Var.b;
            kg.l1 l1Var = b8Var.n;
            g9 g9Var = b8Var.a;
            b8Var.c = obj;
            boolean X3 = jj.X3(document);
            b8Var.s = X3;
            if (X3) {
                l1Var.setColor(t6.x0(null, t6.d6, false));
                l1Var.H = true;
                l1Var.I = false;
                l1Var.invalidate();
            }
            TLRPC.PhotoSize w9 = b8.w(document.thumbs, 90, false, null, false);
            c00 f10 = v5.f(document, t6.a7, 1.0f, b8Var.w);
            if (!jj.p(document)) {
                f7 = 1.0f;
                if (f10 == null) {
                    g9Var.k(ic.c(w9, document), null, "webp", null, b8Var.c);
                } else if (w9 != null) {
                    g9Var.k(ic.c(w9, document), null, "webp", f10, b8Var.c);
                } else {
                    g9Var.k(ic.b(document), null, "webp", f10, b8Var.c);
                }
            } else if (f10 != null) {
                g9Var.k(ic.b(document), "80_80", null, f10, b8Var.c);
                f7 = 1.0f;
            } else if (w9 != null) {
                f7 = 1.0f;
                g9Var.l(ic.b(document), "80_80", ic.c(w9, document), null, 0, b8Var.c);
            } else {
                f7 = 1.0f;
                g9Var.k(ic.b(document), "80_80", null, null, b8Var.c);
            }
            b8Var.b = document;
            Drawable background = b8Var.getBackground();
            if (background != null) {
                background.setAlpha(zs.G3);
                a7.y(b8Var, background, t6.qf, null, PorterDuff.Mode.MULTIPLY);
            }
            if (b8Var.s) {
                b8Var.r = true;
            } else {
                b8Var.r = false;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) l1Var.getLayoutParams();
            if (d20.i(d20.s0).q()) {
                int L = org.telegram.messenger.i0.L(16.0f);
                layoutParams.width = L;
                layoutParams.height = L;
                layoutParams.gravity = 85;
                layoutParams.bottomMargin = org.telegram.messenger.i0.L(8.0f);
                layoutParams.rightMargin = org.telegram.messenger.i0.L(8.0f);
                l1Var.setPadding(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f7));
            } else {
                int L2 = org.telegram.messenger.i0.L(24.0f);
                layoutParams.width = L2;
                layoutParams.height = L2;
                layoutParams.gravity = 81;
                layoutParams.rightMargin = 0;
                layoutParams.bottomMargin = 0;
                l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
            }
            l1Var.setLocked(!d20.i(d20.s0).q());
            org.telegram.messenger.i0.Y3(l1Var, b8Var.r, 0.9f, true, false);
            b8Var.invalidate();
            b8Var.setClearsInputField(true);
            return;
        }
        if (i12 == 3) {
            TextView textView = (TextView) view;
            TLRPC.Chat chat = this.G0.e;
            if (chat != null) {
                if (!w3.N(chat) && (tL_chatBannedRights = chat.default_banned_rights) != null && tL_chatBannedRights.send_inline) {
                    textView.setText(cd.L0(2131749553, null));
                    return;
                } else if (org.telegram.messenger.i0.D1(chat.banned_rights)) {
                    textView.setText(cd.L0(2131753967, null));
                    return;
                } else {
                    textView.setText(cd.a0("AttachInlineRestricted", null, 2131753968, cd.v(chat.banned_rights.until_date)));
                    return;
                }
            }
            return;
        }
        if (i12 == 5) {
            y2 y2Var = (y2) view;
            ArrayList arrayList = this.M;
            if (arrayList == null || i11 < 0 || i11 >= arrayList.size()) {
                return;
            }
            y2Var.a((h3) this.M.get(i11), this.L, false);
            return;
        }
        ArrayList arrayList2 = this.R;
        if (arrayList2 != null) {
            TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = this.T;
            boolean z10 = (tL_inlineBotSwitchPM == null && this.U == null) ? false : true;
            if (i12 == 2) {
                if (z10) {
                    ((org.telegram.ui.Cells.g0) view).setText(tL_inlineBotSwitchPM != null ? tL_inlineBotSwitchPM.text : this.U.text);
                    return;
                }
                return;
            } else {
                if (z10) {
                    i11--;
                }
                if (i11 < 0 || i11 >= arrayList2.size()) {
                    return;
                }
                ((h2) view).e((TLRPC.BotInlineResult) this.R.get(i11), this.w0, this.x0, i11 != this.R.size() - 1, z10 && i11 == 0, "gif".equals(this.q0));
                return;
            }
        }
        if (i12 == 6) {
            v0 v0Var = (v0) view;
            int i13 = i11 + 2;
            if (i13 == 0) {
                this.G = v0Var;
            } else {
                this.H = v0Var;
            }
            TLRPC.Chat chat2 = this.l0;
            if (chat2 == null && (unVar = this.G0) != null) {
                chat2 = unVar.e;
            }
            v0Var.a(i13, str, chat2);
            return;
        }
        if (i12 == 7) {
            return;
        }
        j5 j5Var = (j5) view;
        ArrayList arrayList3 = this.y;
        if (arrayList3 != null) {
            TLObject tLObject = (TLObject) arrayList3.get(i11);
            if (tLObject instanceof TLRPC.User) {
                j5Var.setUser((TLRPC.User) tLObject);
            } else if (tLObject instanceof TLRPC.Chat) {
                j5Var.setChat((TLRPC.Chat) tLObject);
            }
        } else {
            ArrayList arrayList4 = this.I;
            if (arrayList4 == null || i11 < 0 || i11 >= arrayList4.size()) {
                ArrayList arrayList5 = this.N;
                if (arrayList5 == null || i11 < 0 || i11 >= arrayList5.size()) {
                    ArrayList arrayList6 = this.J;
                    if (arrayList6 != null && i11 >= 0 && i11 < arrayList6.size()) {
                        ArrayList arrayList7 = this.K;
                        String str2 = (arrayList7 == null || i11 < 0 || i11 >= arrayList7.size()) ? null : (String) this.K.get(i11);
                        ArrayList arrayList8 = this.P;
                        TLRPC.User user = (arrayList8 == null || i11 < 0 || i11 >= arrayList8.size()) ? null : (TLRPC.User) this.P.get(i11);
                        ArrayList arrayList9 = this.Q;
                        boolean booleanValue = ((arrayList9 == null || i11 < 0 || i11 >= arrayList9.size()) ? null : (Boolean) this.Q.get(i11)).booleanValue();
                        String str3 = (String) this.J.get(i11);
                        j3 j3Var = j5Var.b;
                        TextView textView2 = j5Var.c;
                        r8 r8Var = j5Var.d;
                        g9 g9Var2 = j5Var.a;
                        j5Var.a();
                        if (user != null) {
                            g9Var2.setVisibility(0);
                            r8Var.r(user);
                            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
                            if (userProfilePhoto == null || userProfilePhoto.photo_small == null) {
                                g9Var2.setImageDrawable(r8Var);
                            } else {
                                g9Var2.e(user, r8Var);
                            }
                        } else {
                            g9Var2.setVisibility(4);
                        }
                        textView2.setVisibility(0);
                        if (booleanValue) {
                            dq dqVar = new dq(R.drawable.mini_ephemeral_hidden_14, 0);
                            dqVar.a(t6.A6);
                            dqVar.n = 1;
                            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
                            spannableStringBuilder.append((CharSequence) " *");
                            spannableStringBuilder.setSpan(dqVar, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                            j3Var.setText(spannableStringBuilder);
                        } else {
                            j3Var.setText(str3);
                        }
                        textView2.setText(k6.m(str2, textView2.getPaint().getFontMetricsInt(), false, null, 0));
                    }
                } else {
                    j5Var.setEmojiSuggestion((qi) this.N.get(i11));
                }
            } else {
                j5Var.setText((String) this.I.get(i11));
            }
        }
        j5Var.setDivider(false);
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = 0;
        p6 p6Var = this.H0;
        Context context = this.h;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    org.telegram.ui.Cells.g0 g0Var = new org.telegram.ui.Cells.g0(context);
                    TextView textView = new TextView(context);
                    g0Var.a = textView;
                    textView.setTextSize(1, 15.0f);
                    a7.V(textView, t6.rf, null);
                    textView.setTypeface(org.telegram.messenger.i0.o());
                    textView.setSingleLine(true);
                    textView.setEllipsize(TextUtils.TruncateAt.END);
                    textView.setMaxLines(1);
                    textView.setGravity(cd.X ? 5 : 3);
                    g0Var.addView(textView, b6.d(-2, -2.0f, (cd.X ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
                    view2 = g0Var;
                } else if (i10 == 3) {
                    TextView textView2 = new TextView(context);
                    textView2.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
                    textView2.setTextSize(1, 14.0f);
                    a7.V(textView2, t6.z6, p6Var);
                    view2 = textView2;
                } else if (i10 != 5) {
                    boolean z10 = this.s;
                    if (i10 == 6) {
                        view2 = new v0(context, p6Var, z10);
                    } else if (i10 != 7) {
                        org.telegram.ui.Cells.b8 b8Var = new org.telegram.ui.Cells.b8(context);
                        b8Var.w = p6Var;
                        g9 g9Var = new g9(context);
                        b8Var.a = g9Var;
                        g9Var.setAspectFit(true);
                        g9Var.setLayerNum(1);
                        b8Var.addView(g9Var, b6.d(66, 66.0f, 1, 0.0f, 5.0f, 0.0f, 0.0f));
                        b8Var.setFocusable(true);
                        kg.l1 l1Var = new kg.l1(1, context, null);
                        b8Var.n = l1Var;
                        l1Var.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f));
                        l1Var.setImageReceiver(g9Var.getImageReceiver());
                        b8Var.addView(l1Var, b6.d(24, 24.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
                        view2 = b8Var;
                    } else {
                        View t0Var = new t0(context, i11);
                        ColorDrawable colorDrawable = new ColorDrawable(z10 ? t6.r1(0.15f, -1) : t6.w0(t6.a7, p6Var));
                        if (!z10) {
                            a7.y(t0Var, colorDrawable, t6.a7, p6Var, PorterDuff.Mode.SRC_IN);
                        }
                        eq eqVar = new eq(colorDrawable, t6.X0(context, R.drawable.greydivider, t6.w0(t6.b7, p6Var)), 0, 0);
                        eqVar.x = true;
                        t0Var.setBackground(eqVar);
                        view = t0Var;
                    }
                } else {
                    view = new y2(context, p6Var, false);
                }
            } else {
                h2 h2Var = new h2(context);
                h2Var.setDelegate(new l0(this));
                view2 = h2Var;
            }
            return new ck0(view2);
        }
        j5 j5Var = new j5(context, p6Var);
        j5Var.setIsDarkTheme(false);
        view = j5Var;
        view2 = view;
        return new ck0(view2);
    }
}
