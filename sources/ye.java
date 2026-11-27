// default package

import android.os.Build;
import android.util.Log;
import j$.util.Objects;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.DataSettingsActivity;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class ye implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ye(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        Comparator taVar;
        Comparator taVar2;
        int i;
        byte b = this.a;
        byte b2 = 15;
        byte b3 = 10;
        byte b4 = 6;
        byte b5 = 7;
        byte b6 = 9;
        byte b7 = 2;
        String str = null;
        byte b8 = 1;
        int i2 = 0;
        Object[] objArr = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                k5 k5Var = (k5) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    uc7.s1(k5Var.a).Y3((TLRPC.Updates) tLObject, false);
                    return;
                }
                return;
            case 1:
                hl.c3(new es6(obj, (Object) tL_error, (Object) tLObject, b6));
                return;
            case 2:
                hl.c3(new es6(obj, (Object) tL_error, (Object) tLObject, b2));
                return;
            case 3:
                hl.c3(new a30((pj0) obj, tLObject, b5));
                return;
            case 4:
                r2a r2aVar = (r2a) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap = new HashMap();
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < tL_help_countriesList.countries.size(); i3++) {
                        TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i3);
                        String str2 = tL_help_country.name;
                        if (str2 != null) {
                            tL_help_country.default_name = str2;
                        }
                        if (!tL_help_country.hidden && !tL_help_country.iso2.equalsIgnoreCase("FT")) {
                            String upperCase = tL_help_country.default_name.substring(0, 1).toUpperCase();
                            List list = (List) hashMap.get(upperCase);
                            if (list == null) {
                                list = new ArrayList();
                                hashMap.put(upperCase, list);
                                arrayList.add(upperCase);
                            }
                            list.add(tL_help_country);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator = Collator.getInstance(ob6.D0().y != null ? ob6.D0().y : Locale.getDefault());
                        Objects.requireNonNull(collator);
                        taVar = new kn0(collator, (byte) 0);
                    } else {
                        taVar = new ta((byte) 9);
                    }
                    Collections.sort(arrayList, taVar);
                    Iterator it = hashMap.values().iterator();
                    while (it.hasNext()) {
                        Collections.sort((List) it.next(), new ln0(taVar, (byte) 0));
                    }
                    hl.c3(new es6((Object) r2aVar, (Object) hashMap, (Object) arrayList, (byte) 21));
                    return;
                }
                return;
            case 5:
                te2 te2Var = (te2) obj;
                if (tLObject != null) {
                    TLRPC.TL_help_countriesList tL_help_countriesList2 = (TLRPC.TL_help_countriesList) tLObject;
                    HashMap hashMap2 = new HashMap();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < tL_help_countriesList2.countries.size(); i4++) {
                        TLRPC.TL_help_country tL_help_country2 = tL_help_countriesList2.countries.get(i4);
                        boolean equalsIgnoreCase = tL_help_country2.iso2.equalsIgnoreCase("FT");
                        String str3 = tL_help_country2.name;
                        if (str3 != null) {
                            tL_help_country2.default_name = str3;
                        }
                        if (!tL_help_country2.hidden || equalsIgnoreCase) {
                            if (equalsIgnoreCase) {
                                String M0 = ob6.M0(2131750481, null);
                                tL_help_country2.default_name = M0;
                                tL_help_country2.name = M0;
                            }
                            String upperCase2 = tL_help_country2.default_name.substring(0, 1).toUpperCase();
                            List list2 = (List) hashMap2.get(upperCase2);
                            if (list2 == null) {
                                list2 = new ArrayList();
                                hashMap2.put(upperCase2, list2);
                                arrayList2.add(upperCase2);
                            }
                            list2.add(tL_help_country2);
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 24) {
                        Collator collator2 = Collator.getInstance(ob6.D0().y != null ? ob6.D0().y : Locale.getDefault());
                        Objects.requireNonNull(collator2);
                        taVar2 = new kn0(collator2, (byte) 0);
                    } else {
                        taVar2 = new ta((byte) 9);
                    }
                    Collections.sort(arrayList2, taVar2);
                    Iterator it2 = hashMap2.values().iterator();
                    while (it2.hasNext()) {
                        Collections.sort((List) it2.next(), new ln0(taVar2, (byte) 1));
                    }
                    hl.c3(new es6((Object) te2Var, (Object) hashMap2, (Object) arrayList2, (byte) 23));
                    return;
                }
                return;
            case 6:
                hl.c3(new a30((ht0) obj, tLObject, (byte) 16));
                return;
            case 7:
                hl.c3(new a30((it0) obj, tLObject, (byte) 17));
                return;
            case 8:
                hl.c3(new z21((y31) obj, tLObject, b8));
                return;
            case 9:
                g41 g41Var = (g41) obj;
                g41Var.getClass();
                hl.c3(new tu0(g41Var, tL_error, tLObject, b4));
                return;
            case 10:
                hl.c3(new tu0((i91) obj, tL_error, tLObject, (byte) 13));
                return;
            case 11:
                hl.c3(new dy1((j22) obj, tL_error, b3));
                return;
            case 12:
                hl.c3(new go1((d92) obj, (byte) 26));
                return;
            case 13:
                hl.c3(new ea2((na2) obj, tLObject, (byte) 0));
                return;
            case 14:
                bg2 bg2Var = (bg2) obj;
                if (tLObject != null) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    bg2Var.getMessagesController().Y3(updates, false);
                    if (updates.chats.isEmpty()) {
                        return;
                    }
                    hl.d3(new ea2(bg2Var, updates, (byte) 15), 1000L);
                    return;
                }
                return;
            case 15:
                cu2 cu2Var = (cu2) obj;
                cu2Var.getClass();
                hl.c3(new qt2(cu2Var, b7));
                return;
            case 16:
                hl.c3(new bv2((y13) obj, tLObject, (byte) 14));
                return;
            case 17:
                DataSettingsActivity dataSettingsActivity = (DataSettingsActivity) obj;
                dataSettingsActivity.getClass();
                hl.c3(new b73(dataSettingsActivity, objArr == true ? 1 : 0));
                return;
            case 18:
                hl.c3(new wd3((mk3) obj, tLObject, (byte) 8));
                return;
            case 19:
                gx9 gx9Var = (gx9) obj;
                gx9Var.getClass();
                hl.c3(new wd3(gx9Var, tLObject, b3));
                return;
            case 20:
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                if (tLObject instanceof Vector) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList<T> arrayList4 = ((Vector) tLObject).objects;
                    int size = arrayList4.size();
                    while (i2 < size) {
                        Object obj2 = arrayList4.get(i2);
                        i2++;
                        if (obj2 instanceof TLRPC.TL_transcriptionModel) {
                            TLRPC.TL_transcriptionModel tL_transcriptionModel = (TLRPC.TL_transcriptionModel) obj2;
                            if (tL_transcriptionModel.document instanceof TLRPC.TL_document) {
                                arrayList3.add(tL_transcriptionModel);
                            }
                        }
                    }
                    synchronized (qn3.class) {
                        qn3.a = arrayList3;
                        qn3.k(arrayList3);
                    }
                    Log.d("Dictation", "speech models: " + arrayList3.size() + " from the server");
                    DictationAsr.T();
                    DictationAsr.o();
                } else {
                    bs2.x(new StringBuilder("speech models: list failed: "), tL_error != null ? tL_error.text : null, "Dictation");
                }
                synchronized (qn3.class) {
                    qn3.c = null;
                }
                countDownLatch.countDown();
                return;
            case 21:
                hl.c3(new ve2((lq3) obj, tLObject, b7));
                return;
            case 22:
                hl.c3(new wd3((fw3) obj, tLObject, (byte) 29));
                return;
            case 23:
                hl.c3(new vx3((k04) obj, tLObject, b7));
                return;
            case 24:
                t14 t14Var = (t14) obj;
                if (tLObject != null) {
                    hl.c3(new vx3(t14Var, tLObject, b4));
                    return;
                }
                return;
            case 25:
                bf bfVar = (bf) obj;
                if (tL_error != null) {
                    str = tL_error.text;
                    i = tL_error.code;
                } else {
                    i = 0;
                }
                boolean z = tLObject instanceof TLRPC.TL_boolTrue;
                int i5 = -3;
                if (str == null) {
                    if (z) {
                        i5 = -1;
                    }
                } else if (str.equals("ACCESS_DENIED")) {
                    i5 = -2;
                } else {
                    if (i == 420) {
                        try {
                            i5 = Math.max(0, Integer.parseInt(str.substring(str.lastIndexOf(95) + 1)));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    if (i < 0 || i >= 500 || str.contains("TIMEOUT") || str.equals("ENGINE_SWITCHED") || str.equals("TL_VERIFICATION_ERROR")) {
                        i5 = -4;
                    }
                }
                ea4.e.postRunnable(new hl3(bfVar, i5, b5), 0L);
                return;
            case 26:
                hb4 hb4Var = (hb4) obj;
                if (tL_error != null) {
                    hb4Var.h(0, false);
                    return;
                }
                if (tLObject instanceof Vector) {
                    hb4Var.E0 = false;
                    Vector vector = (Vector) tLObject;
                    if (!vector.objects.isEmpty()) {
                        if (hb4Var.q0 == null) {
                            hb4Var.q0 = new HashMap();
                        }
                        for (int i6 = 0; i6 < vector.objects.size(); i6++) {
                            TLRPC.TL_fileHash tL_fileHash = (TLRPC.TL_fileHash) vector.objects.get(i6);
                            hb4Var.q0.put(Long.valueOf(tL_fileHash.offset), tL_fileHash);
                        }
                    }
                    for (int i7 = 0; i7 < hb4Var.I0.size(); i7++) {
                        gb4 gb4Var = (gb4) hb4Var.I0.get(i7);
                        if (hb4Var.M != null || hb4Var.a0 == gb4Var.e) {
                            hb4Var.I0.remove(i7);
                            if (hb4Var.k(gb4Var, null)) {
                                return;
                            }
                            TLRPC.TL_upload_file tL_upload_file = gb4Var.f;
                            if (tL_upload_file != null) {
                                tL_upload_file.disableFree = false;
                                tL_upload_file.freeResources();
                                return;
                            }
                            TLRPC.TL_upload_webFile tL_upload_webFile = gb4Var.g;
                            if (tL_upload_webFile != null) {
                                tL_upload_webFile.disableFree = false;
                                tL_upload_webFile.freeResources();
                                return;
                            }
                            TLRPC.TL_upload_cdnFile tL_upload_cdnFile = gb4Var.h;
                            if (tL_upload_cdnFile != null) {
                                tL_upload_cdnFile.disableFree = false;
                                tL_upload_cdnFile.freeResources();
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 27:
                hl.c3(new re4(obj, (Object) tL_error, (Object) tLObject, b8));
                return;
            case 28:
                bh4 bh4Var = (bh4) obj;
                if (bh4Var != null) {
                    hl.c3(bh4Var);
                    return;
                }
                return;
            default:
                hl.c3(new gt2((icc) obj, tLObject, tL_error, (byte) 1));
                return;
        }
    }
}
