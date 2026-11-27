// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class wte extends IOException {
    public static wte a() {
        return new wte("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static wte b() {
        return new wte("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static wte c() {
        return new wte("Protocol message had invalid UTF-8.");
    }
}
