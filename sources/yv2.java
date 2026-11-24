// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yv2 {
    public int a;
    public String b;
    public String c;
    public boolean d;
    public final ArrayList e = new ArrayList(4);
    public final ArrayList f = new ArrayList(4);
    public final ArrayList g = new ArrayList(4);
    public final ArrayList h = new ArrayList(4);
    public String i;
    public String j;
    public boolean k;
    public int l;
    public TLRPC.User m;

    public static String a(String str, String str2) {
        return !TextUtils.isEmpty(str) ? str.substring(0, 1) : !TextUtils.isEmpty(str2) ? str2.substring(0, 1) : "#";
    }
}
