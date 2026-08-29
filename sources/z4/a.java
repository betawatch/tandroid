package z4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import f5.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLObject;
import p8.d;
import t4.b;
import t4.e;
import t4.f;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class a extends e {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder b;
    public final ArrayList c;

    public a() {
        super("SubripDecoder");
        this.b = new StringBuilder();
        this.c = new ArrayList();
    }

    public static long d(Matcher matcher, int i10) {
        String group = matcher.group(i10 + 1);
        long parseLong = group != null ? Long.parseLong(group) * 3600000 : 0L;
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong2 = (Long.parseLong(group2) * 60000) + parseLong;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong3 = (Long.parseLong(group3) * 1000) + parseLong2;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong3 += Long.parseLong(group4);
        }
        return parseLong3 * 1000;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x015a, code lost:
    
        if (r8.equals("{\\an6}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0166, code lost:
    
        if (r8.equals("{\\an4}") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x016d, code lost:
    
        if (r8.equals("{\\an3}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017a, code lost:
    
        if (r8.equals("{\\an1}") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0254, code lost:
    
        return new v5.n(10, (t4.b[]) r2.toArray(new t4.b[0]), java.util.Arrays.copyOf(r3, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0147, code lost:
    
        if (r8.equals("{\\an9}") != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016f, code lost:
    
        r6 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x018b, code lost:
    
        if (r8.equals("{\\an9}") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019b, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0192, code lost:
    
        if (r8.equals("{\\an8}") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0199, code lost:
    
        if (r8.equals("{\\an7}") != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b0, code lost:
    
        if (r8.equals("{\\an3}") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c0, code lost:
    
        r0 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b7, code lost:
    
        if (r8.equals("{\\an2}") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01be, code lost:
    
        if (r8.equals("{\\an1}") != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0153, code lost:
    
        if (r8.equals("{\\an7}") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x017c, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    @Override // t4.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f c(int i10, boolean z10, byte[] bArr) {
        String f9;
        String str;
        long[] jArr;
        w wVar;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        b bVar;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        long[] jArr2 = new long[32];
        w wVar2 = new w(bArr, i10);
        Charset y8 = wVar2.y();
        if (y8 == null) {
            y8 = d.c;
        }
        int i15 = 0;
        int i16 = 0;
        while (true) {
            String f11 = wVar2.f(y8);
            if (f11 != null) {
                if (f11.length() != 0) {
                    try {
                        Integer.parseInt(f11);
                        f9 = wVar2.f(y8);
                    } catch (NumberFormatException unused) {
                        f5.a.K("SubripDecoder", "Skipping invalid index: ".concat(f11));
                    }
                    if (f9 == null) {
                        f5.a.K("SubripDecoder", "Unexpected end");
                    } else {
                        Matcher matcher = d.matcher(f9);
                        if (matcher.matches()) {
                            long d10 = d(matcher, 1);
                            if (i16 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i16 * 2);
                            }
                            int i17 = i16 + 1;
                            jArr2[i16] = d10;
                            long d11 = d(matcher, 6);
                            if (i17 == jArr2.length) {
                                jArr2 = Arrays.copyOf(jArr2, i17 * 2);
                            }
                            i16 += 2;
                            jArr2[i17] = d11;
                            StringBuilder sb2 = aVar.b;
                            sb2.setLength(i15);
                            ArrayList arrayList2 = aVar.c;
                            arrayList2.clear();
                            for (String f12 = wVar2.f(y8); !TextUtils.isEmpty(f12); f12 = wVar2.f(y8)) {
                                if (sb2.length() > 0) {
                                    sb2.append("<br>");
                                }
                                String trim = f12.trim();
                                StringBuilder sb3 = new StringBuilder(trim);
                                Matcher matcher2 = e.matcher(trim);
                                int i18 = 0;
                                while (matcher2.find()) {
                                    String group = matcher2.group();
                                    arrayList2.add(group);
                                    int start = matcher2.start() - i18;
                                    int length = group.length();
                                    sb3.replace(start, start + length, "");
                                    i18 += length;
                                }
                                sb2.append(sb3.toString());
                            }
                            Spanned fromHtml = Html.fromHtml(sb2.toString());
                            int i19 = 0;
                            while (true) {
                                if (i19 < arrayList2.size()) {
                                    str = (String) arrayList2.get(i19);
                                    if (!str.matches("\\{\\\\an[1-9]\\}")) {
                                        i19++;
                                    }
                                } else {
                                    str = null;
                                }
                            }
                            if (str == null) {
                                bVar = new b(fromHtml, null, null, null, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, TLObject.FLAG_31, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
                                jArr = jArr2;
                                wVar = wVar2;
                            } else {
                                jArr = jArr2;
                                wVar = wVar2;
                                switch (str.hashCode()) {
                                    case -685620710:
                                        break;
                                    case -685620679:
                                        str.equals("{\\an2}");
                                        i11 = 1;
                                        break;
                                    case -685620648:
                                        break;
                                    case -685620617:
                                        break;
                                    case -685620586:
                                        str.equals("{\\an5}");
                                        i11 = 1;
                                        break;
                                    case -685620555:
                                        break;
                                    case -685620524:
                                        break;
                                    case -685620493:
                                        str.equals("{\\an8}");
                                        i11 = 1;
                                        break;
                                    case -685620462:
                                        break;
                                    default:
                                        i11 = 1;
                                        break;
                                }
                                switch (str.hashCode()) {
                                    case -685620710:
                                        break;
                                    case -685620679:
                                        break;
                                    case -685620648:
                                        break;
                                    case -685620617:
                                        str.equals("{\\an4}");
                                        i12 = 1;
                                        break;
                                    case -685620586:
                                        str.equals("{\\an5}");
                                        i12 = 1;
                                        break;
                                    case -685620555:
                                        str.equals("{\\an6}");
                                        i12 = 1;
                                        break;
                                    case -685620524:
                                        break;
                                    case -685620493:
                                        break;
                                    case -685620462:
                                        break;
                                    default:
                                        i12 = 1;
                                        break;
                                }
                                float f13 = 0.08f;
                                if (i11 != 0) {
                                    i13 = 1;
                                    if (i11 != 1) {
                                        i14 = 2;
                                        if (i11 != 2) {
                                            throw new IllegalArgumentException();
                                        }
                                        f10 = 0.92f;
                                    } else {
                                        i14 = 2;
                                        f10 = 0.5f;
                                    }
                                } else {
                                    i13 = 1;
                                    i14 = 2;
                                    f10 = 0.08f;
                                }
                                if (i12 != 0) {
                                    if (i12 == i13) {
                                        f13 = 0.5f;
                                    } else {
                                        if (i12 != i14) {
                                            throw new IllegalArgumentException();
                                        }
                                        f13 = 0.92f;
                                    }
                                }
                                bVar = new b(fromHtml, null, null, null, f13, 0, i12, f10, i11, TLObject.FLAG_31, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, TLObject.FLAG_31, 0.0f);
                            }
                            arrayList.add(bVar);
                            arrayList.add(b.D);
                            aVar = this;
                            jArr2 = jArr;
                            wVar2 = wVar;
                            i15 = 0;
                        } else {
                            f5.a.K("SubripDecoder", "Skipping invalid timing: ".concat(f9));
                            aVar = this;
                            i15 = 0;
                        }
                    }
                }
            }
        }
    }
}
