package rc;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import m4.g0;
import org.telegram.messenger.qs;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class s {
    public final SocketFactory a;
    public final a b;
    public final int c;
    public int d = 1;
    public int e = qs.Z3;
    public boolean f;
    public Socket g;

    public s(SocketFactory socketFactory, a aVar, int i7, c cVar, SSLSocketFactory sSLSocketFactory) {
        this.a = socketFactory;
        this.b = aVar;
        this.c = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        InetAddress[] inetAddressArr;
        String str = "";
        int i7 = this.d;
        int i10 = this.e;
        SocketFactory socketFactory = this.a;
        a aVar = this.b;
        g0 g0Var = new g0(socketFactory, aVar, this.c, i7, i10);
        UnknownHostException unknownHostException = null;
        try {
            inetAddressArr = InetAddress.getAllByName(aVar.a);
            try {
                Arrays.sort(inetAddressArr, new c5.b(6));
            } catch (UnknownHostException e10) {
                e = e10;
                unknownHostException = e;
                if (inetAddressArr != null) {
                }
                if (unknownHostException == null) {
                }
                throw new v(44, "Failed to resolve hostname " + aVar + ": " + unknownHostException.getMessage(), unknownHostException);
            }
        } catch (UnknownHostException e11) {
            e = e11;
            inetAddressArr = null;
        }
        if (inetAddressArr != null || inetAddressArr.length <= 0) {
            if (unknownHostException == null) {
                unknownHostException = new UnknownHostException("No IP addresses found");
            }
            throw new v(44, "Failed to resolve hostname " + aVar + ": " + unknownHostException.getMessage(), unknownHostException);
        }
        try {
            Socket a10 = g0Var.a(inetAddressArr);
            this.g = a10;
            if (a10 instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) a10;
                String str2 = aVar.a;
                if (this.f && !m.a.verify(str2, sSLSocket.getSession())) {
                    try {
                        str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                    } catch (Exception unused) {
                    }
                    throw new i(49, f1.m("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
                }
            }
        } catch (Exception e12) {
            throw new v(44, "Failed to connect to '" + aVar + "': " + e12.getMessage(), e12);
        }
    }
}
