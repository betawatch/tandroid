package r4;

import android.net.Uri;
import android.text.TextUtils;
import g5.o0;
import j$.util.DesugarTimeZone;
import j3.r1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f implements o0 {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // g5.o0
    public final Object w(Uri uri, g5.o oVar) {
        String readLine = new BufferedReader(new InputStreamReader(oVar, r8.d.c)).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (!matcher.matches()) {
                throw r1.b("Couldn't parse timestamp: " + readLine, null);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= (((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60000) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e6) {
            throw r1.b(null, e6);
        }
    }
}
