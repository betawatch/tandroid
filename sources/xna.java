// default package

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xna {
    public final SocketFactory a;
    public final ra b;
    public final short c;
    public int d = 1;
    public short e = 250;
    public boolean f;
    public Socket g;

    /* JADX WARN: Multi-variable type inference failed */
    public xna(SocketFactory socketFactory, ra raVar, int i, jwe jweVar, SSLSocketFactory sSLSocketFactory) {
        this.a = socketFactory;
        this.b = raVar;
        this.c = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        InetAddress[] inetAddressArr;
        String str = "";
        int i = this.d;
        short s = this.e;
        SocketFactory socketFactory = this.a;
        ra raVar = this.b;
        zna znaVar = new zna(socketFactory, raVar, this.c, i, s);
        UnknownHostException unknownHostException = null;
        try {
            inetAddressArr = InetAddress.getAllByName(raVar.a);
            try {
                Arrays.sort(inetAddressArr, new nu6((byte) 9));
            } catch (UnknownHostException e) {
                e = e;
                unknownHostException = e;
                if (inetAddressArr != null) {
                }
                if (unknownHostException == null) {
                }
                throw new syc(44, "Failed to resolve hostname " + raVar + ": " + unknownHostException.getMessage(), unknownHostException);
            }
        } catch (UnknownHostException e2) {
            e = e2;
            inetAddressArr = null;
        }
        if (inetAddressArr != null || inetAddressArr.length <= 0) {
            if (unknownHostException == null) {
                unknownHostException = new UnknownHostException("No IP addresses found");
            }
            throw new syc(44, "Failed to resolve hostname " + raVar + ": " + unknownHostException.getMessage(), unknownHostException);
        }
        try {
            Socket a = znaVar.a(inetAddressArr);
            this.g = a;
            if (a instanceof SSLSocket) {
                SSLSocket sSLSocket = (SSLSocket) a;
                String str2 = raVar.a;
                if (!this.f || mr7.a.verify(str2, sSLSocket.getSession())) {
                    return;
                }
                try {
                    str = " (" + sSLSocket.getSession().getPeerPrincipal().toString() + ")";
                } catch (Exception unused) {
                }
                throw new ci5(49, c00.j("The certificate of the peer", str, " does not match the expected hostname (", str2, ")"));
            }
        } catch (Exception e3) {
            throw new syc(44, "Failed to connect to '" + raVar + "': " + e3.getMessage(), e3);
        }
    }
}
