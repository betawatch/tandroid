// default package

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.scilab.forge.jlatexmath.TeXFormulaSettingsParser;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class x37 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            m61 m61Var = m61.c;
            sb.append(ixe.a(new m61(((String) obj).getBytes(mr5.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof m61) {
            sb.append(": \"");
            sb.append(ixe.a((m61) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof gu4) {
            sb.append(" {");
            c((gu4) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i3 = i + 2;
        b(sb, i3, "key", entry.getKey());
        b(sb, i3, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x017d, code lost:
    
        if (((java.lang.Integer) r7).intValue() == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01de, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018f, code lost:
    
        if (java.lang.Float.floatToRawIntBits(((java.lang.Float) r7).floatValue()) == 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01a5, code lost:
    
        if (java.lang.Double.doubleToRawLongBits(((java.lang.Double) r7).doubleValue()) == 0) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(gu4 gu4Var, StringBuilder sb, int i) {
        int i2;
        boolean booleanValue;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = gu4Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (substring.endsWith("List") && !substring.endsWith("OrBuilderList") && !substring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb, i, ts2.m(4, 0, substring), gu4.e(method2, gu4Var, new Object[0]));
            } else if (substring.endsWith(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && !substring.equals(TeXFormulaSettingsParser.CHARTODEL_MAPPING_EL) && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb, i, ts2.m(3, 0, substring), gu4.e(method, gu4Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(substring.substring(0, substring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object e = gu4.e(method4, gu4Var, new Object[0]);
                    if (method5 == null) {
                        booleanValue = true;
                        if (e instanceof Boolean) {
                            equals = !((Boolean) e).booleanValue();
                        } else if (!(e instanceof Integer)) {
                            if (!(e instanceof Float)) {
                                if (!(e instanceof Double)) {
                                    equals = e instanceof String ? e.equals("") : e instanceof m61 ? e.equals(m61.c) : !(e instanceof o3) ? false : false;
                                }
                            }
                        }
                        if (equals) {
                            booleanValue = false;
                        }
                    } else {
                        booleanValue = ((Boolean) gu4.e(method5, gu4Var, new Object[0])).booleanValue();
                    }
                    if (booleanValue) {
                        b(sb, i, substring, e);
                    }
                }
            }
            i2 = 3;
        }
        s7c s7cVar = gu4Var.unknownFields;
        if (s7cVar != null) {
            for (int i4 = 0; i4 < s7cVar.a; i4++) {
                b(sb, i, String.valueOf(s7cVar.b[i4] >>> 3), s7cVar.c[i4]);
            }
        }
    }
}
