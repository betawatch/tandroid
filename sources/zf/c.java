package zf;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.o5;
import org.telegram.messenger.r5;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v8;
import rh.h5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class c extends hg.c {
    public b D;
    public a E;
    public int F;
    public long H;
    public boolean I;
    public boolean J;
    public final boolean d;
    public final boolean e;
    public boolean h;
    public boolean n;
    public Location w;
    public String x;
    public String y;
    public boolean f = false;
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final int G = d20.s0;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.e = z11;
    }

    public final void F() {
        if (this.F != 0) {
            ConnectionsManager.getInstance(this.G).cancelRequest(this.F, true);
            this.F = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str == null || str.length() == 0) {
            this.s.clear();
            this.r.clear();
            this.J = false;
            f();
            return;
        }
        if (this.E != null) {
            Utilities.g.a(this.E);
            this.E = null;
        }
        this.J = true;
        r5 r5Var = Utilities.g;
        a aVar = new a((i0) this, str, location, 0);
        this.E = aVar;
        r5Var.d(aVar, 400L);
    }

    public final void H(String str, Location location, boolean z10) {
        Location location2;
        c cVar;
        String str2;
        Location location3;
        Locale locale;
        if ((location != null || this.d) && ((location2 = this.w) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
            Locale locale2 = null;
            this.w = location == null ? null : new Location(location);
            this.x = str;
            if (this.h) {
                this.h = false;
                if (this.F != 0) {
                    ConnectionsManager.getInstance(this.G).cancelRequest(this.F, true);
                    this.F = 0;
                }
            }
            b();
            this.h = true;
            this.f = true;
            TLObject e22 = vp.r1(this.G).e2(this.d ? vp.r1(this.G).L3 : vp.r1(this.G).K3);
            if (e22 instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) e22;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.query = str == null ? "" : str;
                tL_messages_getInlineBotResults.bot = vp.r1(this.G).p1(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = org.telegram.messenger.i0.b0(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = org.telegram.messenger.i0.b0(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (o5.C(this.H)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = vp.r1(this.G).i1(this.H);
                }
                if (TextUtils.isEmpty(str) || !(this.d || this.e)) {
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    cVar.n = false;
                } else {
                    this.n = true;
                    Locale locale3 = cd.D0().y;
                    if (this.d) {
                        if (locale3.getLanguage().contains("en")) {
                            locale = locale3;
                            cVar = this;
                            str2 = str;
                            location3 = location;
                            Utilities.e.c(new v8(cVar, locale3, str2, locale, location3, str, 27));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    Utilities.e.c(new v8(cVar, locale3, str2, locale, location3, str, 27));
                }
                if (location3 == null) {
                    return;
                }
                cVar.F = ConnectionsManager.getInstance(cVar.G).sendRequest(tL_messages_getInlineBotResults, new h5(11, this, str2));
                f();
                return;
            }
            if (z10) {
                int i10 = this.G;
                if (!this.I) {
                    this.I = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = this.d ? vp.r1(i10).L3 : vp.r1(i10).K3;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ag.c(this, 27));
                }
            }
        }
    }
}
