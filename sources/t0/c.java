package t0;

import android.content.ClipData;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.tasks.OnSuccessListener;
import fh.v2;
import g7.i8;
import h3.t0;
import j3.r0;
import j4.x0;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import kh.y7;
import m.t;
import n2.p;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g5;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.gq0;
import org.telegram.ui.xs0;
import r0.j0;
import u3.o;
import v2.m;
import xf.g0;
import xf.s1;
import y3.n;
import y3.v;
import y3.w;
import y8.r;
import yf.a0;
import yf.l2;
import yf.m2;
import yf.n2;
import yf.x1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements f, td.b, n8.e, y8.d, g0, v, s1, b2, y7, OnSuccessListener, ImageReceiver.ImageReceiverDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // td.b
    public /* synthetic */ void B(float f10, int i9) {
        int i10 = this.a;
    }

    @Override // y8.d
    public Object H1(b3.b bVar) {
        switch (this.a) {
            case 4:
                return new v9.c((Context) bVar.a(Context.class), ((s8.h) bVar.a(s8.h.class)).d(), bVar.x(v9.d.class), bVar.e(fa.b.class), (Executor) bVar.c((r) this.b));
            default:
                return this.b;
        }
    }

    @Override // td.b
    public void J0(int i9, float f10, float f11, td.c cVar) {
        switch (this.a) {
            case 1:
                ((Switch) this.b).invalidate();
                break;
            default:
                yg.c.a((yg.c) this.b);
                break;
        }
    }

    @Override // xf.g0
    public Typeface a() {
        Typeface createFromFile;
        createFromFile = Typeface.createFromFile(((Font) this.b).getFile());
        return createFromFile;
    }

    @Override // n8.e
    public Object apply(Object obj) {
        o oVar = (o) obj;
        ((u3.i) this.b).getClass();
        return oVar;
    }

    @Override // y3.v
    public int b(Object obj) {
        t0 t0Var = (t0) this.b;
        n nVar = (n) obj;
        String str = nVar.b;
        return ((str.equals(t0Var.B) || str.equals(w.b(t0Var))) && nVar.c(t0Var, false)) ? 1 : 0;
    }

    public x0 c(t5.c cVar) {
        u2.b bVar = (u2.b) this.b;
        URL url = (URL) cVar.b;
        String c10 = a.a.c("CctTransportBackend");
        if (Log.isLoggable(c10, 4)) {
            Log.i(c10, String.format("Making request to: %s", url));
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.setReadTimeout(bVar.g);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("User-Agent", "datatransport/3.1.9 android/");
        httpURLConnection.setRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
        String str = (String) cVar.c;
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                try {
                    p pVar = bVar.a;
                    v2.i iVar = (v2.i) cVar.d;
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(gZIPOutputStream));
                    s9.d dVar = (s9.d) pVar.b;
                    s9.e eVar = new s9.e(bufferedWriter, dVar.a, dVar.b, dVar.c, dVar.d);
                    eVar.h(iVar);
                    eVar.j();
                    eVar.b.flush();
                    gZIPOutputStream.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                    int responseCode = httpURLConnection.getResponseCode();
                    Integer valueOf = Integer.valueOf(responseCode);
                    String c11 = a.a.c("CctTransportBackend");
                    if (Log.isLoggable(c11, 4)) {
                        Log.i(c11, String.format("Status Code: %d", valueOf));
                    }
                    a.a.a(httpURLConnection.getHeaderField("Content-Type"), "CctTransportBackend", "Content-Type: %s");
                    a.a.a(httpURLConnection.getHeaderField("Content-Encoding"), "CctTransportBackend", "Content-Encoding: %s");
                    if (responseCode == 302 || responseCode == 301 || responseCode == 307) {
                        return new x0(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                    }
                    if (responseCode != 200) {
                        return new x0(responseCode, null, 0L);
                    }
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        InputStream gZIPInputStream = "gzip".equals(httpURLConnection.getHeaderField("Content-Encoding")) ? new GZIPInputStream(inputStream) : inputStream;
                        try {
                            x0 x0Var = new x0(responseCode, null, m.a(new BufferedReader(new InputStreamReader(gZIPInputStream))).a);
                            if (gZIPInputStream != null) {
                                gZIPInputStream.close();
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return x0Var;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (ConnectException e10) {
            e = e10;
            a.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new x0(500, null, 0L);
        } catch (UnknownHostException e11) {
            e = e11;
            a.a.b("CctTransportBackend", "Couldn't open connection, returning with 500", e);
            return new x0(500, null, 0L);
        } catch (IOException e12) {
            e = e12;
            a.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new x0(400, null, 0L);
        } catch (q9.b e13) {
            e = e13;
            a.a.b("CctTransportBackend", "Couldn't encode request, returning with 400", e);
            return new x0(400, null, 0L);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi0 lottieAnimation;
        n2 n2Var = (n2) this.b;
        if (!z10 || z11 || (lottieAnimation = imageReceiver.getLottieAnimation()) == null) {
            return;
        }
        n2Var.q(lottieAnimation);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        g5.a(this, i9, str, drawable);
    }

    @Override // xf.s1
    public void e() {
        xs0 xs0Var = (xs0) this.b;
        TextView textView = xs0Var.u1;
        boolean a2 = xs0Var.B0.a();
        ImageView imageView = xs0Var.s1;
        imageView.animate().cancel();
        imageView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        textView.animate().alpha(a2 ? 1.0f : 0.6f).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(c2 c2Var, int i9) {
        switch (this.a) {
            case 9:
                ((gq0) this.b).run();
                break;
            default:
                ((a0) this.b).a.b2.r();
                break;
        }
    }

    @Override // kh.y7
    public Bitmap g(BitmapFactory.Options options) {
        return BitmapFactory.decodeFile((String) this.b, options);
    }

    @Override // t0.f
    public boolean h(j jVar, int i9, Bundle bundle) {
        r0.e eVar;
        t tVar = (t) this.b;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 25 && (i9 & 1) != 0) {
            try {
                jVar.a.f();
                Parcelable parcelable = (Parcelable) jVar.a.k();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        i iVar = jVar.a;
        ClipData clipData = new ClipData(iVar.j(), new ClipData.Item(iVar.c()));
        if (i10 >= 31) {
            eVar = new r0.d(clipData, 2);
        } else {
            r0.f fVar = new r0.f();
            fVar.b = clipData;
            fVar.c = 2;
            eVar = fVar;
        }
        eVar.b(iVar.g());
        eVar.setExtras(bundle);
        return j0.i(tVar, eVar.build()) == null;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        g5.b(this, imageReceiver);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        int i9 = this.a;
        Object obj2 = this.b;
        switch (i9) {
            case 12:
                x1 x1Var = (x1) obj2;
                x1Var.y0 = true;
                x1Var.x0 = false;
                break;
            case 13:
                v2 v2Var = (v2) obj2;
                ib.b bVar = (ib.b) obj;
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < bVar.a.size(); i10++) {
                    ib.a aVar = (ib.a) bVar.a.get(i10);
                    l2 l2Var = new l2();
                    l2Var.a = aVar.a;
                    l2Var.b = aVar.d;
                    l2Var.c = aVar.e;
                    l2Var.d = aVar.b;
                    l2Var.e = aVar.c;
                    arrayList.add(l2Var);
                }
                v2Var.run(arrayList);
                break;
            default:
                m2 m2Var = (m2) obj2;
                List list = (List) obj;
                m2Var.getClass();
                if (list.size() <= 0) {
                    FileLog.d("objimg: no objects");
                    break;
                } else {
                    int i11 = ((fb.a) list.get(0)).c;
                    String str = null;
                    if (i8.a == null) {
                        i8.a = new String[]{"👥", "🔥", "📚", "🏔", "🧊", "🍱", null, "🚰", "🧸", "🗿", "🍔", "🚜", "🛷", "🐠", "🎪", null, "🪑", "🧔", "🌉", "🩰", "🐦", "🚣", "🏞", null, "🏭", "🎓", "🍶", "🌿", "🌸", "🛋", "😎", "🏗", "🎡", "🐠", "🤿", "🐶", "⛵", "🎨", "🏆", "🧗", "🏸", "🦁", "🚲", "🏟", null, "⛵", "🙂", "🏄", "🍟", "🌇", "🌭", "🩳", "🚌", "🐂", "🌌", "🐹", "🪨", "👥", "👗", "👣", null, "🐻", "🍽", "🗼", "🧱", "🗑", "👤", "🏄", "👙", "🎢", "🏕", "🎠", "🚽", "😆", "🎈", "🎤", "👗", "🚧", "📦", "🐠", "🧺", "🌼", "🛒", "🥊", "💍", "💎", "🎰", "🚗", "🪜", "💻", "🍳", "📽️", "🪑", "🖼", "🍷", "🚢", "🛳", "👥", "🧗", "🕳", "👔", "🛠", "🌊", "🤡", "🎉", "🚴", "☄️", "🎓", "🏟", "🎄", "⛪", "🕰", "👨", "🐄", "🌴", "🖥", "🥌", "🍲", "🐱", "🧃", "🍚", null, "👥", "🏙", null, "🧸", "🍪", "🟩", "🕎", "🧶", "🛹", "✂️", "💅", "🥤", "🍴", "📜", null, "👘", "🧸", "📱", "🚦", "❄️", "🇵🇷", "⛓", "💃", "🏜", "🎅", "🦃", "🤵", "👄", "🏜", "🦕", "👳\u200d♂️", "🔥", "🛏", "🥽", "🐉", "🛋", "🛷", "🧢", "📋", "🎩", "🍨", "🐎", "🧶", "👕", "🧣", "🏖", "⚽", "🖤", "🎧", "🏛", "🚘", "🛹", "🦢", "🍖", "🥅", "🧁", "🐕", "🚤", "🌳", "☕", "⚽", "🧸", "🍲", "🧍", "📖", "🍉", "🍜", "✨", "💼", "🌳", "🐕", "🌲", "🚩", "⛵", "🦶", "🧥", null, "🛏", null, "🛁", "🗻", "🤸\u200d♀️", "👂", "🌸", "🐚", "👵", "🏛", "👁️", "🛏", "⚖️", "🎒", "🐎", "✨", "🛸", "💇", "🧸", "👥", "🪟", "🌟", "🐱", "🐄", "🐞", "❄️", "💍", "🚪", "💎", "🧶", "🏺", "🧥", "❤️", "💪", "🏍", "💰", "🕌", "🍽", "💃", "🛶", "🏖", "🧾", "🏞", "🚨", "🐴", "🧥", "📯", "⌚", "🧱", "🤿", "👖", "🏊", "🎸", "🎭", "🤘", "🌕", "🧥", "💍", "📱", "🪖", "🍽", "🎉", "🌌", "📰", "🗞", null, "🎹", "🪴", "🛂", "🐧", "🐕", "🏰", "🏵", "🏇", "📝", "🎶", "⛵", "🍕", "🐾", "🧵", "🐦", "🛹", "🏄", "🏉", "💄", "🏞", "🏁", "🚣", "🛣", "🏃", "🛋", "🏠", "⭐", "🏅", "👟", "🚤", "🪐", "😴", "🤲", "🏊", "🏫", "🍣", "🛋", "🦸", "😎", "⛷", "🚢", "🎵", "📚", "🏙", "🌋", "📺", "🐎", "💉", "🚆", "🚪", "🥤", "🚗", "👜", "💡", "🎫", "🍷", "🍗", "🎡", "🏄", "💻", null, null, "🏡", "🎣", "❤️", "🌱", "☕", "🍞", "🏖", null, "🏛", "🚁", "⛰", "🦆", "🌱", "🐢", "🐊", "🎶", "👟", "🧶", "💍", "🎤", "🎡", "🏂", "🚤", "🧱", "🚀", "🏠", "🏖", "🌈", "🌿", "👨", "🌷", "👗", "🏞", "🐶", "🦸", "🌸", "🍽", "🔊", "⛪", "🏢", "✈️", "🐾", "🐂", "🪑", "🛕", "🦋", "👠", "🏃", "🪡", "🍳", "🏰", "🌌", "🐛", "🏎", null, "✈️", "🚣", "🧵", "🤵", "🎢", "🍲", "🥦", "🚲", "👖", "🪴", "🗄", "🎂", "💺", "✈️", null, "🌫", "🎆", "🚜", "🦭", "📚", "💇", "⚡", "🚐", "🐱", "🚗", "👖", "🌾", "🤿", "☔", "🛣", "⛵", "🐶", "🔳", "🍽", "👰", "💧", null, "🍴", "🚙", "👶", "👓", "🚗", "✈️", "✋", "🐎", "🏞", "🍽", "⚾", "🍷", "👰", "🌿", "🥧", "🎒", "🃏", "🦹", "🪖", "🛶", "🤳", "🛺", "🏚", "🏹", "🚀", null, "⛈", "⛑"};
                    }
                    if (i11 >= 0) {
                        String[] strArr = i8.a;
                        if (i11 < strArr.length) {
                            str = strArr[i11];
                        }
                    }
                    m2Var.V = str;
                    StringBuilder sb2 = new StringBuilder("objimg: detected #");
                    sb2.append(((fb.a) list.get(0)).c);
                    sb2.append(" ");
                    sb2.append(m2Var.V);
                    sb2.append(" ");
                    r0.x(((fb.a) list.get(0)).a, sb2);
                    Emoji.getEmojiDrawable(m2Var.V);
                    break;
                }
        }
    }

    private final /* synthetic */ void d(float f10, int i9) {
    }

    private final /* synthetic */ void i(float f10, int i9) {
    }
}
