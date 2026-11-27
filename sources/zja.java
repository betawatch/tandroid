// default package

import android.location.Address;
import android.location.Geocoder;
import android.text.TextUtils;
import android.widget.FrameLayout;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class zja implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ double c;
    public final /* synthetic */ double d;

    public /* synthetic */ zja(FrameLayout frameLayout, double d, double d2, byte b) {
        this.a = b;
        this.b = frameLayout;
        this.c = d;
        this.d = d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aka akaVar = (aka) this.b;
                double d = this.c;
                double d2 = this.d;
                try {
                    List<Address> fromLocation = new Geocoder(a.b, ob6.D0().y).getFromLocation(d, d2, 1);
                    if (fromLocation.isEmpty()) {
                        String c = id6.c(d2, d);
                        akaVar.L = c;
                        if (c == null) {
                            akaVar.L = "";
                        } else {
                            akaVar.L = "🌊 " + ((Object) akaVar.L);
                        }
                    } else {
                        Address address = fromLocation.get(0);
                        StringBuilder sb = new StringBuilder();
                        HashSet hashSet = new HashSet();
                        hashSet.add(address.getSubAdminArea());
                        hashSet.add(address.getAdminArea());
                        hashSet.add(address.getLocality());
                        hashSet.add(address.getCountryName());
                        Iterator it = hashSet.iterator();
                        while (it.hasNext()) {
                            String str = (String) it.next();
                            if (!TextUtils.isEmpty(str)) {
                                if (sb.length() > 0) {
                                    sb.append(", ");
                                }
                                sb.append(str);
                            }
                        }
                        akaVar.L = sb.toString();
                        String b = id6.b(address.getCountryCode());
                        if (b != null && pv3.g(b) != null) {
                            akaVar.L = b + " " + ((Object) akaVar.L);
                        }
                    }
                } catch (Exception unused) {
                }
                hl.c3(new zja(akaVar, d, d2, (byte) 1));
                break;
            case 1:
                aka akaVar2 = (aka) this.b;
                double d3 = this.c;
                double d4 = this.d;
                akaVar2.I = d3;
                akaVar2.J = d4;
                akaVar2.H = false;
                CharSequence charSequence = akaVar2.L;
                ema emaVar = akaVar2.d;
                CharSequence m = pv3.m(charSequence, emaVar.getPaint().getFontMetricsInt(), false, null, 0);
                akaVar2.L = m;
                emaVar.l(m, false);
                break;
            default:
                ((s42) this.b).f0(this.c, this.d);
                break;
        }
    }
}
