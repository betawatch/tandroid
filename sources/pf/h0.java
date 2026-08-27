package pf;

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
import f2.o1;
import h7.b6;
import h7.z5;
import java.util.ArrayList;
import java.util.Locale;
import lh.c5;
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
import org.telegram.messenger.rl;
import org.telegram.messenger.y1;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.j4;
import org.telegram.ui.Cells.p6;
import org.telegram.ui.Cells.r4;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s4;
import org.telegram.ui.Cells.t4;
import org.telegram.ui.Cells.u4;
import org.telegram.ui.Cells.w6;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.lk0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.y8;
import org.telegram.ui.jc0;
import org.telegram.ui.nc0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class h0 extends c implements LocationController.LocationFetchCallback {
    public final int G;
    public final Context H;
    public int I;
    public p6 J;
    public Location K;
    public Location L;
    public String M;
    public String N;
    public Location O;
    public final int P;
    public final long Q;
    public int R;
    public MessageObject S;
    public TLRPC.TL_channelLocation T;
    public ArrayList U;
    public boolean V;
    public final boolean W;
    public final c6 X;
    public boolean Y;
    public TLRPC.TL_messageMediaVenue Z;
    public TLRPC.TL_messageMediaVenue a0;
    public boolean b0;
    public final boolean c0;
    public jc0 d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;
    public FrameLayout h0;

    public h0(Context context, int i10, long j10, boolean z10, c6 c6Var, boolean z11, boolean z12, boolean z13) {
        super(z11, z13);
        this.G = UserConfig.selectedAccount;
        this.R = -1;
        this.U = new ArrayList();
        this.Y = true;
        this.f0 = false;
        this.g0 = false;
        this.c0 = z12;
        this.H = context;
        this.P = i10;
        this.Q = j10;
        this.W = z10;
        this.X = c6Var;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(o1 o1Var) {
        int i10 = o1Var.f;
        if (i10 == 6) {
            if (LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) == null && this.K == null) {
                return false;
            }
        } else if (i10 != 1 && i10 != 3 && i10 != 8 && i10 != 12 && i10 != 7) {
            return false;
        }
        return true;
    }

    public final void I() {
        int i10 = this.P;
        if (i10 == 8) {
            Location location = this.L;
            if (location == null && (location = this.K) == null) {
                return;
            }
            this.V = true;
            Q();
            LocationController.fetchLocationAddress(location, this.e ? 1 : 0, this);
            return;
        }
        if (i10 != 4) {
            Location location2 = this.L;
            if (location2 != null) {
                Location location3 = this.O;
                if (location3 == null || location3.distanceTo(location2) > 20.0f) {
                    this.N = null;
                }
                this.V = true;
                Q();
                LocationController.fetchLocationAddress(location2, this.d ? 2 : 0, this);
                return;
            }
            return;
        }
        Location location4 = this.L;
        if (location4 == null && (location4 = this.K) == null) {
            return;
        }
        Location location5 = this.O;
        if (location5 == null || location5.distanceTo(location4) > 100.0f) {
            this.N = null;
        }
        this.V = true;
        Q();
        LocationController.fetchLocationAddress(location4, this);
    }

    public final Object J(int i10) {
        int i11 = this.P;
        if (i11 == 4) {
            if (this.N == null) {
                return null;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
            tL_messageMediaVenue.address = this.N;
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaVenue.geo = tL_geoPoint;
            Location location = this.L;
            if (location != null) {
                tL_geoPoint.lat = location.getLatitude();
                tL_messageMediaVenue.geo._long = this.L.getLongitude();
                return tL_messageMediaVenue;
            }
            Location location2 = this.K;
            if (location2 != null) {
                tL_geoPoint.lat = location2.getLatitude();
                tL_messageMediaVenue.geo._long = this.K.getLongitude();
            }
            return tL_messageMediaVenue;
        }
        MessageObject messageObject = this.S;
        ArrayList arrayList = this.s;
        if (messageObject == null) {
            int i12 = 2;
            if (i11 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i12 = 3;
                }
                if (i10 >= i12) {
                    return this.U.get(i10 - i12);
                }
                return null;
            }
            if (i11 == 1) {
                if (i10 > 4 && i10 < arrayList.size() + 5) {
                    return arrayList.get(i10 - 5);
                }
            } else if (i11 == 7) {
                int i13 = this.a0 == null ? 3 : 4;
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
                return this.U.get(i10 - 5);
            }
        }
        return null;
    }

    public final void L(Location location) {
        this.L = location;
        I();
        Q();
    }

    public final void M(Location location) {
        int i10;
        boolean z10 = this.K == null;
        this.K = location;
        if (this.L == null) {
            I();
        }
        if (z10 && (i10 = this.R) > 0) {
            m(i10);
        }
        if (this.S != null) {
            n(1, new Object());
            if (this.U.isEmpty()) {
                return;
            }
            r(2, this.U.size(), new Object());
            return;
        }
        if (this.P != 2) {
            Q();
        } else {
            if (this.U.isEmpty()) {
                return;
            }
            r(2, this.U.size(), new Object());
        }
    }

    public void N(ArrayList arrayList) {
        this.U = new ArrayList(arrayList);
        long clientUserId = UserConfig.getInstance(this.G).getClientUserId();
        for (int i10 = 0; i10 < this.U.size(); i10++) {
            if (((nc0) this.U.get(i10)).a == clientUserId || ((nc0) this.U.get(i10)).b.out) {
                this.U.remove(i10);
                break;
            }
        }
        l();
    }

    public final void O(boolean z10, boolean z11) {
        if (this.f0 == z10 && this.g0 == z11) {
            return;
        }
        this.f0 = z10;
        this.g0 = z11;
        if (z11) {
            this.Z = null;
            this.a0 = null;
        }
        l();
    }

    public final void P(int i10) {
        this.I = i10;
        FrameLayout frameLayout = this.h0;
        if (frameLayout != null) {
            f2.y0 y0Var = (f2.y0) frameLayout.getLayoutParams();
            if (y0Var == null) {
                y0Var = new f2.y0(-1, this.I);
            } else {
                ((ViewGroup.MarginLayoutParams) y0Var).height = this.I;
            }
            this.h0.setLayoutParams(y0Var);
            this.h0.forceLayout();
        }
    }

    public final void Q() {
        String str;
        p6 p6Var = this.J;
        if (p6Var != null) {
            int i10 = this.P;
            if (i10 == 8) {
                this.J.b(LocaleController.getString(R.string.SetThisLocation), !TextUtils.isEmpty(this.M) ? this.M : !TextUtils.isEmpty(this.N) ? this.N : this.V ? LocaleController.getString(R.string.Loading) : LocaleController.getString(R.string.UnknownLocation));
                this.J.setHasLocation(true);
                return;
            }
            str = "";
            if (i10 != 4 && this.L == null) {
                if (this.K != null) {
                    p6Var.b(LocaleController.getString(R.string.SendLocation), LocaleController.formatString(R.string.AccurateTo, LocaleController.formatPluralString("Meters", (int) this.K.getAccuracy(), new Object[0])));
                    this.J.setHasLocation(true);
                    return;
                } else {
                    p6Var.b(LocaleController.getString(R.string.SendLocation), this.f0 ? "" : LocaleController.getString(R.string.Loading));
                    this.J.setHasLocation(!this.f0);
                    return;
                }
            }
            if (!TextUtils.isEmpty(this.M)) {
                str = this.M;
            } else if (TextUtils.isEmpty(this.N)) {
                Location location = this.L;
                if ((location == null && this.K == null) || this.V) {
                    str = LocaleController.getString(R.string.Loading);
                } else if (location != null) {
                    str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location.getLatitude()), Double.valueOf(this.L.getLongitude()));
                } else {
                    Location location2 = this.K;
                    if (location2 != null) {
                        str = String.format(Locale.US, "(%f,%f)", Double.valueOf(location2.getLatitude()), Double.valueOf(this.K.getLongitude()));
                    } else if (!this.f0) {
                        str = LocaleController.getString(R.string.Loading);
                    }
                }
            } else {
                str = this.N;
            }
            if (this.b0) {
                this.J.b(LocaleController.getString(R.string.AttachSelectedLocation), str);
            } else if (i10 == 4) {
                this.J.b(LocaleController.getString(R.string.ChatSetThisLocation), str);
            } else {
                this.J.b(LocaleController.getString(R.string.SendSelectedLocation), str);
            }
            this.J.setHasLocation(true);
        }
    }

    @Override // f2.q0
    public final int h() {
        int i10 = this.P;
        if (i10 != 6 && i10 != 5 && i10 != 4 && !this.e) {
            int i11 = 0;
            if (this.S != null) {
                if (!this.U.isEmpty()) {
                    i11 = this.U.size() + 3;
                } else if (!this.c0) {
                    i11 = 1;
                }
                r1 = 2 + i11;
            } else if (i10 == 2) {
                LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(this.Q);
                int size = this.U.size() + 2;
                if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                    i11 = 1;
                }
                r1 = size + i11;
            } else {
                boolean z10 = this.h;
                boolean z11 = this.W;
                if (!z10 && this.f) {
                    ArrayList arrayList = this.s;
                    if (!arrayList.isEmpty()) {
                        r1 = arrayList.size() + this.r.size() + (z11 ? 1 : 0) + (i10 != 1 ? 5 : 6);
                    }
                }
                if (i10 == 0) {
                    r3 = 5;
                } else if (i10 == 7) {
                    r3 = (this.a0 != null ? 1 : 0) + 5;
                }
                boolean z12 = this.f0;
                r1 = ((((z12 || (!this.h && this.f)) ? 0 : 2) + (z11 ? 1 : 0)) - (z12 ? 2 : 0)) + r3;
            }
        }
        return (this.d0 == null || !this.e0) ? r1 : r1 + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x0101 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0111 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00e5  */
    @Override // f2.q0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int j(int i10) {
        int i11;
        if (i10 == h() - 1 && this.d0 != null && this.e0) {
            return 13;
        }
        if (i10 == 0) {
            return 0;
        }
        int i12 = this.P;
        if (i12 == 6) {
            return 8;
        }
        if (this.W && i10 == h() - 1) {
            return 11;
        }
        if (i12 == 5) {
            return 8;
        }
        if (i12 != 4) {
            LocationController.SharingLocationInfo sharingLocationInfo = (i12 == 2 || i12 == 1) ? LocationController.getInstance(this.G).getSharingLocationInfo(this.Q) : null;
            if (this.S != null) {
                if (this.U.isEmpty()) {
                    return i10 == 2 ? 9 : 8;
                }
                if (i10 == 2) {
                    return 10;
                }
                if (i10 != 3) {
                    if (i10 != 4) {
                        return 8;
                    }
                    this.R = i10;
                    return 6;
                }
            } else {
                if (i12 == 2) {
                    if (i10 != 2 || sharingLocationInfo == null || sharingLocationInfo.period == Integer.MAX_VALUE) {
                        if (i10 != 1) {
                            return 8;
                        }
                        if (sharingLocationInfo == null || sharingLocationInfo.period != Integer.MAX_VALUE) {
                            this.R = i10;
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
                        if (this.a0 != null) {
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
                                        if (i10 > 6 || ((!this.h && this.f) || this.f0)) {
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
                            this.R = -1;
                            return 7;
                        }
                        this.R = i10;
                        return 6;
                    }
                    if (i10 == 3) {
                        return 10;
                    }
                    if (i10 != 4) {
                        if (this.h || arrayList.isEmpty() || !this.f) {
                            if (i10 > 7 || ((!this.h && this.f) || this.f0)) {
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
        this.V = false;
        this.O = location;
        int i10 = this.P;
        if (i10 == 8) {
            this.N = str2;
        } else {
            this.N = str;
        }
        if (i10 == 7 && this.g0) {
            this.Z = null;
            this.a0 = null;
        }
        boolean z10 = this.a0 != null;
        if (i10 != 7) {
            Q();
            return;
        }
        this.Z = tL_messageMediaVenue;
        this.a0 = tL_messageMediaVenue2;
        if (z10 != (tL_messageMediaVenue2 == null)) {
            q(1, 2);
            return;
        }
        m(1);
        if (this.a0 == null) {
            u(2);
        } else {
            o(2);
        }
    }

    @Override // f2.q0
    public final void v(o1 o1Var, int i10) {
        int i11;
        int i12 = o1Var.f;
        View view = o1Var.a;
        int i13 = this.P;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = null;
        switch (i12) {
            case 0:
                f2.y0 y0Var = (f2.y0) view.getLayoutParams();
                if (y0Var == null) {
                    y0Var = new f2.y0(-1, this.I);
                } else {
                    ((ViewGroup.MarginLayoutParams) y0Var).height = this.I;
                }
                view.setLayoutParams(y0Var);
                break;
            case 1:
                this.J = (p6) view;
                Q();
                break;
            case 2:
                j4 j4Var = (j4) view;
                if (this.S == null) {
                    j4Var.setText(LocaleController.getString(R.string.NearbyVenue));
                    break;
                } else {
                    j4Var.setText(LocaleController.getString(R.string.LiveLocations));
                    break;
                }
            case 3:
                r4 r4Var = (r4) view;
                if (i13 == 0) {
                    i11 = i10 - 4;
                } else {
                    if (i13 == 7 || i13 == 8) {
                        int i14 = i10 - 4;
                        if (this.a0 == null) {
                            i11 = i14;
                        }
                    }
                    i11 = i10 - 5;
                }
                if (this.f && (i13 != 7 || !this.h)) {
                    ArrayList arrayList = this.r;
                    if (i11 >= 0 && i11 < arrayList.size()) {
                        tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i11);
                        r4Var.b(tL_messageMediaVenue, r3, true, false);
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
                r4Var.b(tL_messageMediaVenue, r3, true, false);
                break;
            case 4:
                ((t4) view).setLoading(this.h);
                break;
            case 6:
                p6 p6Var = (p6) view;
                p6Var.setHasLocation(this.K != null);
                int i15 = i10 + 1;
                if (i15 < h() && j(i15) == 7) {
                    r5 = true;
                }
                p6Var.s = r5;
                p6Var.invalidate();
                break;
            case 7:
                ((p6) view).setHasLocation(this.K != null);
                break;
            case 8:
                r7 r7Var = (r7) view;
                if (i13 != 6) {
                    TLRPC.TL_channelLocation tL_channelLocation = this.T;
                    long j10 = this.Q;
                    if (tL_channelLocation == null) {
                        MessageObject messageObject = this.S;
                        if (messageObject != null && i10 == 1) {
                            r7Var.b(messageObject, this.K, this.f0);
                            break;
                        } else {
                            int i16 = i10 - (messageObject != null ? 5 : 2);
                            LocationController.SharingLocationInfo sharingLocationInfo = LocationController.getInstance(this.G).getSharingLocationInfo(j10);
                            if (sharingLocationInfo != null && sharingLocationInfo.period != Integer.MAX_VALUE) {
                                i16--;
                            }
                            if (i16 >= 0 && i16 < this.U.size()) {
                                nc0 nc0Var = (nc0) this.U.get(i16);
                                Location location = this.K;
                                TextView textView = r7Var.d;
                                n9 n9Var = r7Var.a;
                                h5 h5Var = r7Var.b;
                                Location location2 = r7Var.v;
                                r7Var.s = nc0Var;
                                if (DialogObject.isUserDialog(nc0Var.a)) {
                                    TLRPC.User user = MessagesController.getInstance(r7Var.x).getUser(Long.valueOf(nc0Var.a));
                                    if (user != null) {
                                        r7Var.f.m(r7Var.x, user);
                                        h5Var.l(ContactsController.formatName(user.first_name, user.last_name), false);
                                        n9Var.e(user, r7Var.f);
                                    }
                                } else {
                                    TLRPC.Chat chat = MessagesController.getInstance(r7Var.x).getChat(Long.valueOf(-nc0Var.a));
                                    if (chat != null) {
                                        r7Var.f.k(r7Var.x, chat);
                                        h5Var.l(chat.title, false);
                                        n9Var.e(chat, r7Var.f);
                                    }
                                }
                                IMapsProvider.LatLng position = nc0Var.e.getPosition();
                                location2.setLatitude(position.latitude);
                                location2.setLongitude(position.longitude);
                                int i17 = nc0Var.b.edit_date;
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
                        TextView textView2 = r7Var.d;
                        Location location3 = r7Var.v;
                        n9 n9Var2 = r7Var.a;
                        r7Var.x = UserConfig.selectedAccount;
                        String str = tL_channelLocation.address;
                        r7Var.f = null;
                        String str2 = "";
                        if (DialogObject.isUserDialog(j10)) {
                            TLRPC.User user2 = MessagesController.getInstance(r7Var.x).getUser(Long.valueOf(j10));
                            if (user2 != null) {
                                r7Var.f = new y8(0, user2);
                                str2 = UserObject.getUserName(user2);
                                n9Var2.e(user2, r7Var.f);
                            }
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(r7Var.x).getChat(Long.valueOf(-j10));
                            if (chat2 != null) {
                                y8 y8Var = new y8(chat2);
                                r7Var.f = y8Var;
                                str2 = chat2.title;
                                n9Var2.e(chat2, y8Var);
                            }
                        }
                        r7Var.b.l(str2, false);
                        location3.setLatitude(tL_channelLocation.geo_point.lat);
                        location3.setLongitude(tL_channelLocation.geo_point._long);
                        r7Var.e = true;
                        textView2.setSingleLine(true);
                        textView2.setText(str);
                        break;
                    }
                } else {
                    r7Var.b(this.S, this.K, this.f0);
                    break;
                }
                break;
            case 11:
                view.setBackgroundColor(g6.v0(this.f0 ? g6.i5 : g6.h5, this.X));
                break;
            case 12:
                r4 r4Var2 = (r4) view;
                if (!this.g0) {
                    if (i10 != 1) {
                        r4Var2.b(this.a0, 2, false, this.Y);
                        break;
                    } else {
                        r4Var2.b(this.Z, 2, this.a0 != null, this.Y);
                        break;
                    }
                } else {
                    r4Var2.b(null, 2, i10 == 1 && this.a0 != null, false);
                    break;
                }
                break;
        }
    }

    @Override // f2.q0
    public final o1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        int i11 = 17;
        long j10 = this.Q;
        c6 c6Var = this.X;
        Context context = this.H;
        switch (i10) {
            case 0:
                FrameLayout frameLayout = new FrameLayout(context);
                this.h0 = frameLayout;
                frameLayout.setTag(-33024);
                this.h0.setLayoutParams(new f2.y0(-1, this.I));
                view2 = frameLayout;
                break;
            case 1:
                view2 = new p6(context, c6Var, false, false);
                break;
            case 2:
                view2 = new j4(context, c6Var);
                break;
            case 3:
                view2 = new r4(context, c6Var);
                break;
            case 4:
                t4 t4Var = new t4(context);
                RadialProgressView radialProgressView = new RadialProgressView(context, c6Var);
                t4Var.a = radialProgressView;
                t4Var.addView(radialProgressView, z5.e(-2, -2, 17));
                ImageView imageView = new ImageView(context);
                t4Var.c = imageView;
                imageView.setImageResource(R.drawable.location_empty);
                imageView.setColorFilter(new PorterDuffColorFilter(g6.v0(g6.W5, c6Var), PorterDuff.Mode.MULTIPLY));
                t4Var.addView(imageView, z5.d(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 24.0f));
                TextView textView = new TextView(context);
                t4Var.b = textView;
                textView.setTextColor(g6.v0(g6.X5, c6Var));
                textView.setGravity(17);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 17.0f);
                textView.setText(LocaleController.getString(R.string.NoPlacesFound));
                t4Var.addView(textView, z5.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
                view = t4Var;
                view2 = view;
                break;
            case 5:
                u4 u4Var = new u4(context);
                LinearLayout linearLayout = new LinearLayout(context);
                u4Var.addView(linearLayout, z5.e(-2, -2, 17));
                TextView h = y1.h(context, 1, 16.0f);
                int i12 = g6.A6;
                h.setTextColor(g6.v0(i12, c6Var));
                h.setText("Powered by");
                linearLayout.addView(h, z5.n(-2, -2));
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.foursquare);
                imageView2.setColorFilter(new PorterDuffColorFilter(g6.v0(i12, c6Var), PorterDuff.Mode.MULTIPLY));
                imageView2.setPadding(0, AndroidUtilities.dp(2.0f), 0, 0);
                linearLayout.addView(imageView2, z5.n(35, -2));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 16.0f);
                textView2.setTextColor(g6.v0(i12, c6Var));
                textView2.setText("Foursquare");
                linearLayout.addView(textView2, z5.n(-2, -2));
                view = u4Var;
                view2 = view;
                break;
            case 6:
                p6 p6Var = new p6(context, c6Var, true, false);
                p6Var.setDialogId(j10);
                view2 = p6Var;
                break;
            case 7:
                p6 p6Var2 = new p6(context, c6Var, true, true);
                p6Var2.setDialogId(j10);
                view2 = p6Var2;
                break;
            case 8:
                int i13 = this.P;
                view2 = new r7((i13 == 4 || i13 == 5 || i13 == 3) ? 16 : 54, context, c6Var, true);
                break;
            case 9:
                s4 s4Var = new s4(context);
                FrameLayout frameLayout2 = new FrameLayout(context);
                s4Var.a = frameLayout2;
                frameLayout2.setBackground(w5.e(new float[]{8.0f}, g6.v0(g6.Oh, c6Var)));
                s4Var.addView(frameLayout2, z5.d(-1, 48.0f, 51, 16.0f, 10.0f, 16.0f, 0.0f));
                h5 h5Var = new h5(context);
                h5Var.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                h5Var.setGravity(17);
                h5Var.setDrawablePadding(AndroidUtilities.dp(8.0f));
                h5Var.setTextColor(g6.v0(g6.Sh, c6Var));
                h5Var.setTextSize(14);
                h5Var.l(LocaleController.getString(R.string.Directions), false);
                h5Var.setLeftDrawable(R.drawable.filled_directions);
                h5Var.setTypeface(AndroidUtilities.bold());
                frameLayout2.addView(h5Var, z5.c(-1.0f, -1));
                frameLayout2.setOutlineProvider(gf.r0.b);
                frameLayout2.setClipToOutline(true);
                b6.b(frameLayout2, 0.02f, 1.2f);
                s4Var.setOnButtonClick(new c5(this, i11));
                view2 = s4Var;
                break;
            case 10:
                View w6Var = new w6(context, (rl) null);
                new dq(new ColorDrawable(g6.v0(g6.a7, c6Var)), g6.V0(context, R.drawable.greydivider_bottom, g6.b7)).w = true;
                view2 = w6Var;
                break;
            case 11:
            default:
                view2 = new View(context);
                break;
            case 12:
                r4 r4Var = new r4(context, c6Var);
                r4Var.setAllowTextAnimation(true);
                view2 = r4Var;
                break;
            case 13:
                view2 = this.d0;
                break;
        }
        return new lk0(view2);
    }

    public void K() {
    }
}
