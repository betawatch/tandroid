package tf;

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
import org.telegram.ui.qi1;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class c extends bg.c {
    public a B;
    public int C;
    public long E;
    public boolean F;
    public boolean G;
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
    public final int D = UserConfig.selectedAccount;

    public c(boolean z4, boolean z10) {
        this.d = z4;
        this.e = z10;
    }

    public final void F() {
        if (this.C != 0) {
            ConnectionsManager.getInstance(this.D).cancelRequest(this.C, true);
            this.C = 0;
        }
    }

    public final void G(String str, Location location) {
        if (str == null || str.length() == 0) {
            this.s.clear();
            this.r.clear();
            this.G = false;
            l();
            return;
        }
        if (this.B != null) {
            Utilities.searchQueue.cancelRunnable(this.B);
            this.B = null;
        }
        this.G = true;
        DispatchQueue dispatchQueue = Utilities.searchQueue;
        a aVar = new a((i0) this, str, location, 0);
        this.B = aVar;
        dispatchQueue.postRunnable(aVar, 400L);
    }

    public final void H(String str, Location location, boolean z4) {
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
                if (this.C != 0) {
                    ConnectionsManager.getInstance(this.D).cancelRequest(this.C, true);
                    this.C = 0;
                }
            }
            h();
            this.h = true;
            this.f = true;
            TLObject userOrChat = MessagesController.getInstance(this.D).getUserOrChat(this.d ? MessagesController.getInstance(this.D).storyVenueSearchBot : MessagesController.getInstance(this.D).venueSearchBot);
            if (userOrChat instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) userOrChat;
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.query = str == null ? "" : str;
                tL_messages_getInlineBotResults.bot = MessagesController.getInstance(this.D).getInputUser(user);
                tL_messages_getInlineBotResults.offset = "";
                if (location != null) {
                    TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
                    tL_messages_getInlineBotResults.geo_point = tL_inputGeoPoint;
                    tL_inputGeoPoint.lat = AndroidUtilities.fixLocationCoord(location.getLatitude());
                    tL_messages_getInlineBotResults.geo_point._long = AndroidUtilities.fixLocationCoord(location.getLongitude());
                    tL_messages_getInlineBotResults.flags |= 1;
                }
                if (DialogObject.isEncryptedDialog(this.E)) {
                    tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                } else {
                    tL_messages_getInlineBotResults.peer = MessagesController.getInstance(this.D).getInputPeer(this.E);
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
                            Utilities.globalQueue.postRunnable(new kh.e1(cVar, currentLocale, str2, locale, location3, str, 21));
                        } else {
                            locale2 = Locale.US;
                        }
                    }
                    locale = locale2;
                    cVar = this;
                    str2 = str;
                    location3 = location;
                    Utilities.globalQueue.postRunnable(new kh.e1(cVar, currentLocale, str2, locale, location3, str, 21));
                }
                if (location3 == null) {
                    return;
                }
                cVar.C = ConnectionsManager.getInstance(cVar.D).sendRequest(tL_messages_getInlineBotResults, new qi1(6, this, str2));
                l();
                return;
            }
            if (z4) {
                int i10 = this.D;
                if (!this.F) {
                    this.F = true;
                    TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                    tL_contacts_resolveUsername.username = this.d ? MessagesController.getInstance(i10).storyVenueSearchBot : MessagesController.getInstance(i10).venueSearchBot;
                    ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new ff.a(this, 20));
                }
            }
        }
    }
}
