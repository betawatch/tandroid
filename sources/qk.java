// default package

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class qk implements h8c {
    public final /* synthetic */ SpannableStringBuilder a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ qk(SpannableStringBuilder spannableStringBuilder, int i, boolean z, boolean z2) {
        this.a = spannableStringBuilder;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h8c
    public final Object run() {
        int i;
        boolean z;
        boolean z2;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder = this.a;
        String obj = spannableStringBuilder.toString();
        int i7 = 0;
        if (!obj.contains("\u202c") && !obj.contains("\u202d") && !obj.contains("\u202e")) {
            if (!gl.T.matcher(obj).find()) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
                boolean z4 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z2 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof i4c) || z2) {
                        spannableStringBuilder.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z5 = this.c;
                int i8 = 4;
                if (!z5 && (this.b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder, 4);
                }
                Pattern pattern = r46.a;
                String[] strArr = {"http://", "https://", "tg://", "tonsite://"};
                ik ikVar = gl.c0;
                SpannableStringBuilder spannableStringBuilder2 = TextUtils.indexOf((CharSequence) spannableStringBuilder, (char) 9472) >= 0 ? new SpannableStringBuilder(spannableStringBuilder.toString().replace((char) 9472, ' ')) : spannableStringBuilder;
                if (!TextUtils.isEmpty(spannableStringBuilder2) && TextUtils.lastIndexOf(spannableStringBuilder2, '_') == spannableStringBuilder2.length() - 1) {
                    spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder2.toString()).replace(spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), (CharSequence) "a");
                }
                Matcher matcher = pattern.matcher(spannableStringBuilder2);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (ikVar == null || ikVar.acceptMatch(spannableStringBuilder2, start, end)) {
                        dl dlVar = new dl();
                        String group = matcher.group(i7);
                        i5 = i7;
                        while (true) {
                            if (i7 >= i8) {
                                i6 = i5;
                                break;
                            }
                            String str = strArr[i7];
                            if (group.regionMatches(true, 0, str, 0, str.length())) {
                                String str2 = strArr[i7];
                                if (!group.regionMatches(false, 0, str2, 0, str2.length())) {
                                    group = strArr[i7] + group.substring(strArr[i7].length());
                                }
                                i6 = 1;
                            } else {
                                i7++;
                                i8 = 4;
                            }
                        }
                        if (i6 == 0) {
                            group = b00.j(new StringBuilder(), strArr[i5], group);
                        }
                        if (z5) {
                            z3 = true;
                            if (!d01.g(Uri.parse(group), true, null)) {
                            }
                        } else {
                            z3 = true;
                        }
                        dlVar.a = group;
                        dlVar.b = start;
                        dlVar.c = end;
                        arrayList.add(dlVar);
                    } else {
                        i5 = i7;
                        z3 = z4;
                    }
                    z4 = z3;
                    i7 = i5;
                    i8 = 4;
                }
                i = i7;
                boolean z6 = z4;
                Collections.sort(arrayList, new sa((byte) 2));
                int size = arrayList.size();
                int i9 = i;
                while (i9 < size - 1) {
                    dl dlVar2 = (dl) arrayList.get(i9);
                    int i10 = i9 + 1;
                    dl dlVar3 = (dl) arrayList.get(i10);
                    int i11 = dlVar2.b;
                    int i12 = dlVar3.b;
                    if (i11 <= i12 && (i2 = dlVar2.c) > i12) {
                        int i13 = dlVar3.c;
                        int i14 = (i13 <= i2 || (i3 = i2 - i11) > (i4 = i13 - i12)) ? i10 : i3 < i4 ? i9 : -1;
                        if (i14 != -1) {
                            arrayList.remove(i14);
                            size--;
                        }
                    }
                    i9 = i10;
                }
                if (arrayList.size() != 0) {
                    int size2 = arrayList.size();
                    for (int i15 = i; i15 < size2; i15++) {
                        dl dlVar4 = (dl) arrayList.get(i15);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder.getSpans(dlVar4.b, dlVar4.c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i16 = i; i16 < uRLSpanArr2.length; i16++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i16];
                                spannableStringBuilder.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof i4c) || z2) {
                                    spannableStringBuilder.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str3 = dlVar4.a;
                        if (str3 != null) {
                            str3 = str3.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!d01.k(str3)) {
                            spannableStringBuilder.setSpan(new URLSpan(str3), dlVar4.b, dlVar4.c, 33);
                        }
                    }
                    z = z6;
                    return Boolean.valueOf(z);
                }
                z = i;
                return Boolean.valueOf(z);
            }
        }
        i = 0;
        z = i;
        return Boolean.valueOf(z);
    }
}
