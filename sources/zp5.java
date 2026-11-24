// default package

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public class zp5 extends IOException {
    public boolean a;

    public static zp5 a() {
        return new zp5("Protocol message had invalid UTF-8.");
    }

    public static yp5 b() {
        return new yp5("Protocol message tag had invalid wire type.");
    }

    public static zp5 c() {
        return new zp5("CodedInputStream encountered a malformed varint.");
    }

    public static zp5 d() {
        return new zp5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zp5 e() {
        return new zp5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
