package z8;

import android.os.Parcel;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static int a(Float f7, float f10) {
        return AndroidUtilities.dp(f7.floatValue() * f10);
    }

    public static UnsupportedOperationException b(Parcel parcel) {
        g8.a.b(parcel);
        return new UnsupportedOperationException();
    }
}
