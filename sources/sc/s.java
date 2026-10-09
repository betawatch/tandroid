package sc;

import j4.f0;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.telegram.messenger.MediaDataController;
import org.telegram.ui.Cells.c1;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class s {
    public final SocketFactory a;
    public final a b;
    public final int c;
    public int d = 1;
    public int e = MediaDataController.MAX_LINKS_COUNT;
    public boolean f;
    public Socket g;

    public s(SocketFactory socketFactory, a aVar, int i10, c cVar, SSLSocketFactory sSLSocketFactory) {
        this.a = socketFactory;
        this.b = aVar;
        this.c = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        InetAddress[] inetAddressArr;
        String str = "";
        int i10 = this.d;
        int i11 = this.e;
        SocketFactory socketFactory = this.a;
        a aVar = this.b;
        f0 f0Var = new f0(socketFactory, aVar, this.c, i10, i11);
        UnknownHostException unknownHostException = null;
        try {
            inetAddressArr = InetAddress.getAllByName(aVar.a);
            try {
                Arrays.sort(inetAddressArr, new fb.i(6));
            } catch (UnknownHostException e7) {
                e = e7;
                unknownHostException = e;
                if (inetAddressArr != null) {
                }
                if (unknownHostException == null) {
                }
                throw new w(44, "Failed to resolve hostname " + aVar + ": " + unknownHostException.getMessage(), unknownHostException);
            }
        } catch (UnknownHostException e10) {
            e = e10;
            inetAddressArr = null;
        }
        if (inetAddressArr != null || inetAddressArr.length <= 0) {
            if (unknownHostException == null) {
                unknownHostException = new UnknownHostException("No IP addresses found");
            }
            throw new w(44, "Failed to resolve hostname " + aVar + ": " + unknownHostException.getMessage(), unknownHostException);
        }
        try {
            Socket a2 = f0Var.a(inetAddressArr);
            this.g = a2;
            if (a2 instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) a2;
                String str2 = aVar.a;
                if (this.f && !m.a.verify(str2, sSLSocket.getSession())) {
                    try {
                        str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                    } catch (Exception unused) {
                    }
                    throw new i(49, c1.i("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
                }
            }
        } catch (Exception e11) {
            throw new w(44, "Failed to connect to '" + aVar + "': " + e11.getMessage(), e11);
        }
    }
}
