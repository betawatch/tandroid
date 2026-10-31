package sc;

import c3.g0;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class j {
    public static final Logger d;
    public volatile ServerSocket a;
    public Thread b;
    public g0 c;

    static {
        Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);
        Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);
        Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");
        d = Logger.getLogger(j.class.getName());
    }

    public static String b(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            d.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e);
            return null;
        }
    }

    public static h c(g gVar, String str, String str2) {
        byte[] bArr;
        b bVar = new b(str);
        if (str2 == null) {
            return new h(gVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        String str3 = "US-ASCII";
        String str4 = bVar.c;
        try {
            if (!Charset.forName(str4 == null ? "US-ASCII" : str4).newEncoder().canEncode(str2) && str4 == null) {
                bVar = new b(str + "; charset=UTF-8");
            }
            String str5 = bVar.c;
            if (str5 != null) {
                str3 = str5;
            }
            bArr = str2.getBytes(str3);
        } catch (UnsupportedEncodingException e) {
            d.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e);
            bArr = new byte[0];
        }
        return new h(gVar, bVar.a, new ByteArrayInputStream(bArr), bArr.length);
    }

    public static final void d(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (!(obj instanceof ServerSocket)) {
                        throw new IllegalArgumentException("Unknown object to close");
                    }
                    ((ServerSocket) obj).close();
                }
            } catch (IOException e) {
                d.log(Level.SEVERE, "Could not close", (Throwable) e);
            }
        }
    }

    public static boolean g(h hVar) {
        String str = hVar.b;
        if (str != null) {
            return str.toLowerCase().contains("text/") || str.toLowerCase().contains("/json");
        }
        return false;
    }

    public abstract h e(d dVar);

    public final void f() {
        this.a = new ServerSocket();
        this.a.setReuseAddress(true);
        ci.h hVar = new ci.h(this);
        Thread thread = new Thread(hVar);
        this.b = thread;
        thread.setDaemon(true);
        this.b.setName("NanoHttpd Main Listener");
        this.b.start();
        while (!hVar.b && ((IOException) hVar.c) == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        IOException iOException = (IOException) hVar.c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
