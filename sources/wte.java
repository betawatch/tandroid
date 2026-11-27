// default package

import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
