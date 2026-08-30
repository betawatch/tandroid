package tf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.location.Location;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Locale;
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.s6;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Cells.v4;
import org.telegram.ui.Cells.w4;
import org.telegram.ui.Cells.x4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.el0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qc0;
import org.telegram.ui.uc0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class h0 extends c implements LocationController.LocationFetchCallback {
    public final int H;
    public final Context I;
    public int J;
    public s6 K;
    public Location L;
    public Location M;
    public String N;
    public String O;
    public Location P;
    public final int Q;
    public final long R;
    public int S;
    public MessageObject T;
    public TLRPC.TL_channelLocation U;
    public ArrayList V;
    public boolean W;
    public final boolean X;
    public final f6 Y;
    public boolean Z;
    public TLRPC.TL_messageMediaVenue a0;
    public TLRPC.TL_messageMediaVenue b0;
    public boolean c0;
    public final boolean d0;
    public qc0 e0;
    public boolean f0;
    public boolean g0;
    public boolean h0;
    public FrameLayout i0;

    public h0(Context context, int i10, long j10, boolean z4, f6 f6Var, boolean z10, boolean z11, boolean z12) {
        super(z10, z12);
        this.H = UserConfig.selectedAccount;
        this.S = -1;
        this.V = new ArrayList();
        this.Z = true;
        this.g0 = false;
        this.h0 = false;
        this.d0 = z11;
        this.I = context;
        this.Q = i10;
        this.R = j10;
        this.X = z4;
        this.Y = f6Var;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        int i10 = l1Var.f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.H).getSharingLocationInfo(this.R) == null && this.L == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10 = this.Q;
        if (i10 == 8) {
            Location location = this.M;
            if (location == null && (location = this.L) == null) {
                return;
            }
            this.W = true;
            Q();
            LocationController.fetchLocationAddress(location, this.e ? 1 : 0, this);
            return;
        }
        if (i10 != 4) {
            Location location2 = this.M;
            if (location2 != null) {
                Location location3 = this.P;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.O = null;
                }
                this.W = true;
                Q();
                LocationController.fetchLocationAddress(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.M;
        if (location4 == null && (location4 = this.L) == null) {
            return;
        }
        Location location5 = this.P;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.O = null;
        }
        this.W = true;
        Q();
        LocationController.fetchLocationAddress(location4, this);
    }

    public final Object J(int i10) {
        int i11 = this.Q;
        if (i11 == 4) {
            if (this.O == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.O;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.M;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.M.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.L;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.L.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.T;
        ArrayList arrayList = this.s;
        if (messageObject == null) {
            int i12 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.H).getSharingLocationInfo(this.R);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i12 = 3;
                }
                if (i10 >= i12) {
                    return this.V.get(i10 - i12);
                }
                return null;
            }
            if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                int i13 = this.b0 == null ? 3 : 4;
                ArrayList arrayList2 = this.r;
                if (i10 > i13) {
                    int i14 = i13 + 1;
                    if (i10 < arrayList2.size() + i14) {
                        return arrayList2.get(i10 - i14);
                    }
                }
                int size = arrayList2.size() + i13;
                if (i10 > size) {
                    int i15 = size + 1;
                    if (i10 < arrayList.size() + i15) {
                        return arrayList.get(i10 - i15);
                    }
                }
            } else if (i10 > 3 && i10 < arrayList.size() + 4) {
                return arrayList.get(i10 - 4);
            }
        } else {
            if (i10 == 1) {
                return messageObject;
            }
            if (i10 > 4 && i10 < arrayList.size() + 4) {
                return this.V.get(i10 - 5);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.M = location;
        I();
        Q();
    }

    public final void M(Location location) {
        int i10;
        boolean z4 = this.L == null;
        this.L = location;
        if (this.M == null) {
            I();
        }
        if (z4 && (i10 = this.S) > 0) {
            m(i10);
        }
        if (this.T != null) {
            n(1, new Object());
            if (this.V.isEmpty()) {
                return;
            }
            r(2, this.V.size(), new Object());
            return;
        }
        if (this.Q != 2) {
            Q();
        } else {
            if (this.V.isEmpty()) {
                return;
            }
            r(2, this.V.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.V = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.H).getClientUserId();
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            if (((uc0) this.V.get(i10)).a == clientUserId || ((uc0) this.V.get(i10)).b.out) {
                this.V.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z4, boolean z10) {
        if (this.g0 == z4 && this.h0 == z10) {
            return;
        }
        this.g0 = z4;
        this.h0 = z10;
        if (z10) {
            this.a0 = null;
            this.b0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.J = i10;
        FrameLayout frameLayout = this.i0;
        if (frameLayout != null) {
            f2.w0 w0Var = (f2.w0) frameLayout.getLayoutParams();
            if (w0Var == null) {
                w0Var = new f2.w0(-1, this.J);
            } else {
                ((ViewGroup.MarginLayoutParams) w0Var).height = this.J;
            }
            this.i0.setLayoutParams(w0Var);
            this.i0.forceLayout();
        }
    }

    public final void Q() {
        String str;
        s6 s6Var = this.K;
        if (s6Var != null) {
            int i10 = this.Q;
            if (i10 == 8) {
                this.K.b(LocaleController.getString(R.string.SetThisLocation), !TextUtils.isEmpty(this.N) ? this.N : !TextUtils.isEmpty(this.O) ? this.O : this.W ? LocaleController.getString(R.string.Loading) : LocaleController.getString(R.string.UnknownLocation));
                this.K.setHasLocation(true);
                return;
            }
            str = "";
            if (i10 != 4 && this.M == null) {
                if (this.L != null) {
                    s6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.L.getAccuracy(), new Object[0])));
                    this.K.setHasLocation(true);
                    return;
                } else {
                    s6Var.b(LocaleController.getString(R.string.SendLocation), this.g0 ? "" : LocaleController.getString(R.string.Loading));
                    this.K.setHasLocation(!this.g0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.N)) {
                str = this.N;
            } else if (TextUtils.isEmpty(this.O)) {
                Location location = this.M;
                if ((location == null && this.L == null) || this.W) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.M.getLongitude()));
                } else {
                    Location location2 = this.L;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.L.getLongitude()));
                    } else if (!this.g0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            } else {
                str = this.O;
            }
            if (this.c0) {
                this.K.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.K.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.K.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.K.setHasLocation(true);
        }
    }

    @Override // f2.o0
    public final int h() {
        int i10 = this.Q;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.e) {
            int i11 = 0;
            if (this.T != null) {
                if (!this.V.isEmpty()) {
                    i11 = this.V.size() + 3;
                } else if (!this.d0) {
                    i11 = 1;
                }
                r1 = 2 + i11;
            } else if (i10 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.H).getSharingLocationInfo(this.R);
                int size = this.V.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                r1 = size + i11;
            } else {
                boolean z4 = this.h;
                boolean z10 = this.X;
                if (!z4 && this.f) {
                    ArrayList arrayList = this.s;
                    if (!arrayList.isEmpty()) {
                        r1 = arrayList.size() + this.r.size() + (z10 ? 1 : 0) + (i10 != 1 ? 5 : 6);
                    }
                }
                if (i10 == 0) {
                    r3 = 5;
                } else if (i10 == 7) {
                    r3 = (this.b0 != null ? 1 : 0) + 5;
                }
                boolean z11 = this.g0;
                r1 = ((((z11 || (!this.h && this.f)) ? 0 : 2) + (z10 ? 1 : 0)) - (z11 ? 2 : 0)) + r3;
            }
        }
        return (this.e0 == null || !this.f0) ? r1 : r1 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    @Override // f2.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11;
        if (i10 == h() - 1 && this.e0 != null && this.f0) {
            return 13;
        }
        if (i10 == 0) {
            return 0;
        }
        int i12 = this.Q;
        if (i12 == 6) {
            return 8;
        }
        if (this.X && i10 == h() - 1) {
            return 11;
        }
        if (i12 == 5) {
            return 8;
        }
        if (i12 != 4) {
            LocationController.SharingLocationInfo sharingLocationInfo = (i12 == 2 || i12 == 1) ? LocationController.getInstance(this.H).getSharingLocationInfo(this.R) : null;
            if (this.T != null) {
                if (this.V.isEmpty()) {
                    return i10 == 2 ? 9 : 8;
                }
                if (i10 == 2) {
                    return 10;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return 8;
                    }
                    this.S = i10;
                    return 6;
                }
            } else {
                if (i12 == 2) {
                    if (i10 != 2 || sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) {
                        if (i10 != 1) {
                            return 8;
                        }
                        if (sharingLocationInfo == null || sharingLocationInfo.period != Integer.MAX_VALUE) {
                            this.S = i10;
                            return 6;
                        }
                    }
                    return 7;
                }
                ArrayList arrayList = this.s;
                if (i12 != 1) {
                    int size = arrayList.size();
                    ArrayList arrayList2 = this.r;
                    int size2 = arrayList2.size() + size;
                    if (i12 == 7) {
                        if (i10 == 1) {
                            return 12;
                        }
                        if (this.b0 != null) {
                            if (i10 == 2) {
                                return 12;
                            }
                            i10--;
                            i11 = 3;
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    return 10;
                                }
                                if (i10 != 3) {
                                    if (this.h || (arrayList.isEmpty() && arrayList2.isEmpty())) {
                                        if (i10 > 6 || ((!this.h && this.f) || this.g0)) {
                                        }
                                    } else if (i10 == size2 + i11) {
                                    }
                                    return 3;
                                }
                            }
                        }
                    }
                    i11 = 4;
                    if (i10 != 1) {
                    }
                } else if (i10 != 1) {
                    if (i10 == 2) {
                        if (sharingLocationInfo != null) {
                            this.S = -1;
                            return 7;
                        }
                        this.S = i10;
                        return 6;
                    }
                    if (i10 == 3) {
                        return 10;
                    }
                    if (i10 != 4) {
                        if (this.h || arrayList.isEmpty() || !this.f) {
                            if (i10 > 7 || ((!this.h && this.f) || this.g0)) {
                                return 4;
                            }
                        } else if (i10 == arrayList.size() + 5) {
                            return 5;
                        }
                        return 3;
                    }
                }
            }
            return 2;
        }
        return 1;
    }

    @Override // org.telegram.messenger.LocationController.LocationFetchCallback
    public final void onLocationAddressAvailable(String str, String str2, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLRPC.TL_messageMediaVenue tL_messageMediaVenue2, Location location) {
        this.W = false;
        this.P = location;
        int i10 = this.Q;
        if (i10 == 8) {
            this.O = str2;
        } else {
            this.O = str;
        }
        if (i10 == 7 && this.h0) {
            this.a0 = null;
            this.b0 = null;
        }
        boolean z4 = this.b0 != null;
        if (i10 != 7) {
            Q();
            return;
        }
        this.a0 = tL_messageMediaVenue;
        this.b0 = tL_messageMediaVenue2;
        if (z4 != (tL_messageMediaVenue2 == null)) {
            q(1, 2);
            return;
        }
        m(1);
        if (this.b0 == null) {
            u(2);
        } else {
            o(2);
        }
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        int i12 = l1Var.f;
        View view = l1Var.a;
        int i13 = this.Q;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        switch (i12) {
            case 0:
                f2.w0 w0Var = (f2.w0) view.getLayoutParams();
                if (w0Var == null) {
                    w0Var = new f2.w0(-1, this.J);
                } else {
                    ((ViewGroup.MarginLayoutParams) w0Var).height = this.J;
                }
                view.setLayoutParams(w0Var);
                break;
            case 1:
                this.K = (s6) view;
                Q();
                break;
            case 2:
                m4 m4Var = (m4) view;
                if (this.T == null) {
                    m4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    break;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    break;
                }
            case 3:
                u4 u4Var = (u4) view;
                if (i13 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i13 == 7 || i13 == 8) {
                        int i14 = i10 - 4;
                        if (this.b0 == null) {
                            i11 = i14;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f && (i13 != 7 || !this.h)) {
                    ArrayList arrayList = this.r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        u4Var.b(tL_messageMediaVenue, r3, true, false);
                        break;
                    } else {
                        int size = i11 - arrayList.size();
                        if (size >= 0) {
                            ArrayList arrayList2 = this.s;
                            if (size < arrayList2.size()) {
                                tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList2.get(size);
                            }
                        }
                    }
                }
                r3 = i11;
                u4Var.b(tL_messageMediaVenue, r3, true, false);
                break;
            case 4:
                ((w4) view).setLoading(this.h);
                break;
            case 6:
                s6 s6Var = (s6) view;
                s6Var.setHasLocation(this.L != null);
                int i15 = i10 + 1;
                if (i15 < h() && j(i15) == 7) {
                    r5 = true;
                }
                s6Var.s = r5;
                s6Var.invalidate();
                break;
            case 7:
                ((s6) view).setHasLocation(this.L != null);
                break;
            case 8:
                u7 u7Var = (u7) view;
                if (i13 != 6) {
                    TLRPC.TL_channelLocation tL_channelLocation = this.U;
                    long j10 = this.R;
                    if (tL_channelLocation == null) {
                        MessageObject messageObject = this.T;
                        if (messageObject != null && i10 == 1) {
                            u7Var.b(messageObject, this.L, this.g0);
                            break;
                        } else {
                            int i16 = i10 - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.H).getSharingLocationInfo(j10);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i16--;
                            }
                            if (i16 >= 0 && i16 < this.V.size()) {
                                uc0 uc0Var = (uc0) this.V.get(i16);
                                Location location = this.L;
                                TextView textView = u7Var.d;
                                p9 p9Var = u7Var.a;
                                k5 k5Var = u7Var.b;
                                Location location2 = u7Var.v;
                                u7Var.s = uc0Var;
                                if (DialogObject.isUserDialog(uc0Var.a)) {
                                    TLRPC.User user = MessagesController.getInstance(u7Var.x).getUser(Long.valueOf(uc0Var.a));
                                    if (user != null) {
                                        u7Var.f.m(u7Var.x, user);
                                        k5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                                        p9Var.e(user, u7Var.f);
                                    }
                                } else {
                                    TLRPC.Chat chat = MessagesController.getInstance(u7Var.x).getChat(Long.valueOf(-uc0Var.a));
                                    if (chat != null) {
                                        u7Var.f.k(u7Var.x, chat);
                                        k5Var.l(chat.title, false);
                                        p9Var.e(chat, u7Var.f);
                                    }
                                }
                                IMapsProvider.LatLng position = uc0Var.e.getPosition();
                                location2.setLatitude(position.latitude);
                                location2.setLongitude(position.longitude);
                                int i17 = uc0Var.b.edit_date;
                                String formatLocationUpdateDate = LocaleController.formatLocationUpdateDate(i17 != 0 ? i17 : r11.date);
                                if (location == null) {
                                    textView.setText(formatLocationUpdateDate);
                                    break;
                                } else {
                                    textView.setText(formatLocationUpdateDate + " - " + LocaleController.formatDistance(location2.distanceTo(location), 0));
                                    break;
                                }
                            }
                        }
                    } else {
                        TextView textView2 = u7Var.d;
                        Location location3 = u7Var.v;
                        p9 p9Var2 = u7Var.a;
                        u7Var.x = UserConfig.selectedAccount;
                        String str = tL_channelLocation.address;
                        u7Var.f = null;
                        String str2 = "";
                        if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user2 = MessagesController.getInstance(u7Var.x).getUser(Long.valueOf(j10));
                            if (user2 != null) {
                                u7Var.f = new z8(0, user2);
                                str2 = UserObject.getUserName(user2);
                                p9Var2.e(user2, u7Var.f);
                            }
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(u7Var.x).getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                z8 z8Var = new z8(chat2);
                                u7Var.f = z8Var;
                                str2 = chat2.title;
                                p9Var2.e(chat2, z8Var);
                            }
                        }
                        u7Var.b.l(str2, false);
                        location3.setLatitude(tL_channelLocation.geo_point.lat);
                        location3.setLongitude(tL_channelLocation.geo_point._long);
                        u7Var.e = true;
                        textView2.setSingleLine(true);
                        textView2.setText(str);
                        break;
                    }
                } else {
                    u7Var.b(this.T, this.L, this.g0);
                    break;
                }
                break;
            case 11:
                view.setBackgroundColor(j6.v0(this.g0 ? j6.i5 : j6.h5, this.Y));
                break;
            case 12:
                u4 u4Var2 = (u4) view;
                if (!this.h0) {
                    if (i10 != 1) {
                        u4Var2.b(this.b0, 2, false, this.Z);
                        break;
                    } else {
                        u4Var2.b(this.a0, 2, this.b0 != null, this.Z);
                        break;
                    }
                } else {
                    u4Var2.b(null, 2, i10 == 1 && this.b0 != null, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        long j10 = this.R;
        f6 f6Var = this.Y;
        Context context = this.I;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.i0 = frameLayout;
                frameLayout.setTag(-33024);
                this.i0.setLayoutParams(new f2.w0(-1, this.J));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new s6(context, f6Var, false, false);
                break;
            case 2:
                view2 = new m4(context, f6Var);
                break;
            case 3:
                view2 = new u4(context, f6Var);
                break;
            case 4:
                w4 w4Var = new w4(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, f6Var);
                w4Var.a = radialProgressView;
                w4Var.addView(radialProgressView, b6.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                w4Var.c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.W5, f6Var), PorterDuff.Mode.MULTIPLY));
                w4Var.addView(imageView, b6.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                w4Var.b = textView;
                textView.setTextColor(j6.v0(j6.X5, f6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                w4Var.addView(textView, b6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = w4Var;
                view2 = view;
                break;
            case 5:
                x4 x4Var = new x4(context);
                LinearLayout linearLayout = new LinearLayout(context);
                x4Var.addView(linearLayout, b6.e(-2, -2, 17));
                TextView g10 = y3.g(context, 1, 16.0f);
                int i11 = j6.A6;
                g10.setTextColor(j6.v0(i11, f6Var));
                g10.setText("Powered by");
                linearLayout.addView(g10, b6.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(j6.v0(i11, f6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, b6.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(j6.v0(i11, f6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, b6.n(-2, -2));
                view = x4Var;
                view2 = view;
                break;
            case 6:
                s6 s6Var = new s6(context, f6Var, true, false);
                s6Var.setDialogId(j10);
                view2 = s6Var;
                break;
            case 7:
                s6 s6Var2 = new s6(context, f6Var, true, true);
                s6Var2.setDialogId(j10);
                view2 = s6Var2;
                break;
            case 8:
                int i12 = this.Q;
                view2 = new u7((i12 == 4 || i12 == 5 || i12 == 3) ? 16 : 54, context, f6Var, true);
                break;
            case 9:
                v4 v4Var = new v4(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                v4Var.a = frameLayout2;
                frameLayout2.setBackground(z5.e(new float[]{8.0f}, j6.v0(j6.Oh, f6Var)));
                v4Var.addView(frameLayout2, b6.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                k5 k5Var = new k5(context);
                k5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                k5Var.setGravity(17);
                k5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                k5Var.setTextColor(j6.v0(j6.Sh, f6Var));
                k5Var.setTextSize(14);
                k5Var.l(LocaleController.getString(R.string.Directions), false);
                k5Var.setLeftDrawable(R.drawable.filled_directions);
                k5Var.setTypeface(AndroidUtilities.bold());
                frameLayout2.addView(k5Var, b6.c(-1.0f, -1));
                frameLayout2.setOutlineProvider(lf.q0.b);
                frameLayout2.setClipToOutline(true);
                d6.b(frameLayout2, 0.02f, 1.2f);
                v4Var.setOnButtonClick(new oh.n(this, 21));
                view2 = v4Var;
                break;
            case 10:
                View z6Var = new z6(context, (org.telegram.ui.b) null);
                new nq(new ColorDrawable(j6.v0(j6.a7, f6Var)), j6.V0(context, R.drawable.greydivider_bottom, j6.b7)).w = true;
                view2 = z6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                u4 u4Var = new u4(context, f6Var);
                u4Var.setAllowTextAnimation(true);
                view2 = u4Var;
                break;
            case 13:
                view2 = this.e0;
                break;
        }
        return new el0(view2);
    }

    public void K() {
    }
}
