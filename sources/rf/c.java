package rf;

import android.location.Location;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.qe1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class c extends zf.b {
    public a A;
    public int B;
    public long D;
    public boolean E;
    public boolean F;
    public final boolean d;
    public final boolean e;
    public boolean h;
    public boolean n;
    public Location v;
    public String w;
    public String x;
    public b y;
    public boolean f = false;
    public final ArrayList r = new ArrayList();
    public final ArrayList s = new ArrayList();
    public final int C = UserConfig.selectedAccount;

    public c(boolean z10, boolean z11) {
        this.d = z10;
        this.e = z11;
    }

    public final void F() {
        if (this.B != 0) {
            ConnectionsManager.getInstance(this.C).cancelRequest(this.B, true);
            this.B = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str == null || str.length() == 0) {
            this.s.clear();
            this.r.clear();
            this.F = false;
            l();
            return;
        }
        if (this.A != null) {
            Utilities.searchQueue.cancelRunnable(this.A);
            this.A = null;
        }
        this.F = true;
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        a aVar = new a((j0) this, str, location, 0);
        this.A = aVar;
        dispatchQueue.postRunnable(aVar, 400L);
    }

    public final void H(String str, Location location, boolean z10) {
        Location location2;
        c cVar;
        String str2;
        Location location3;
        Locale locale;
        if ((location != null || this.d) && ((location2 = this.v) == null || location == null || location.distanceTo(location2) >= 200.0f)) {
            Locale locale2 = null;
            this.v = location == null ? null : new Location(location);
            this.w = str;
            if (this.h) {
                this.h = false;
                if (this.B != 0) {
                    ConnectionsManager.getInstance(this.C).cancelRequest(this.B, true);
                    this.B = 0;
                }
            }
            h();
            this.h = true;
            this.f = true;
            TLObject userOrChat = MessagesController.getInstance(this.C).getUserOrChat(this.d ? MessagesController.getInstance(this.C).storyVenueSearchBot : MessagesController.getInstance(this.C).venueSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.query = str == null ? "" : str;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.C).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.D)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.C).getInputPeer(this.D);
                }
                if (TextUtils.isEmpty(str) || !(this.d || this.e)) {
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    cVar.n = false;
                } else {
                    this.n = true;
                    Locale currentLocale = LocaleController.getInstance().getCurrentLocale();
                    if (this.d) {
                        if (currentLocale.getLanguage().contains("en")) {
                            locale = currentLocale;
                            cVar = this;
                            str2 = str;
                            location3 = location;
                            Utilities.globalQueue.postRunnable(new ih.f1(cVar, currentLocale, str2, locale, location3, str, 21));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    Utilities.globalQueue.postRunnable(new ih.f1(cVar, currentLocale, str2, locale, location3, str, 21));
                }
                if (location3 == null) {
                    return;
                }
                cVar.B = ConnectionsManager.getInstance(cVar.C).sendRequest(tL_messages_getInlineBotResults, new qe1(6, this, str2));
                l();
                return;
            }
            if (z10) {
                int i10 = this.C;
                if (!this.E) {
                    this.E = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = this.d ? MessagesController.getInstance(i10).storyVenueSearchBot : MessagesController.getInstance(i10).venueSearchBot;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ef.a(this, 20));
                }
            }
        }
    }
}
